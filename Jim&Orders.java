// Jim's Burgers has a line of hungry customers.
//  Orders vary in the time it takes to prepare them. 
//  Determine the order the customers receive their orders. 
//  \Start by numbering each of the customers from 1 to n ,
//  front of the line to the back. You will then be given an 
//  order number and a preparation time for each customer.



public static List<Integer> jimOrders(List<List<Integer>> orders) {
    // Write your code here 
    
    Map<Integer,Set<Integer>> tmap = new TreeMap<>();
    int customer =1;
    for(List<Integer> list: orders){
        int sum = 0;
        for(int val : list){
            sum = sum+val;
        }
        if(tmap.containsKey(sum)){
            Set<Integer> hset = tmap.get(sum);
            hset.add(customer);
            tmap.put(sum,hset);
        }
        else{
            Set<Integer> hset = new TreeSet<>();
            hset.add(customer);
            tmap.put(sum,hset);
        }
        customer++;
    }
      List<Integer> list = new ArrayList<>();
      for(int key:tmap.keySet()){
          for(int val:tmap.get(key)){
              list.add(val);
          }
      }
      return list;
    }

}
