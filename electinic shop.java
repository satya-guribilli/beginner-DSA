// A person wants to determine the most expensive computer keyboard and USB drive that can be purchased with a give budget. Given price lists for keyboards and USB drives and a budget, find the cost to buy them. If it is not possible to buy both items, return .



static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        
         Arrays.sort(keyboards);
         Arrays.sort(drives);
         int max = -1;
         for(int i=0;i<keyboards.length;i++){
             int keyboardsprice = keyboards[i];
             for(int j=0;j<drives.length;j++){
                 int drivesprice = drives[j];
                 int totalprice = keyboardsprice+drivesprice;
                 if(totalprice<=b){
                     max = Math.max(max,totalprice);
                 }
             }
         }
         return max;

    }