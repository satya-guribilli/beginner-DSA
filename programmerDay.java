// Marie invented a Time Machine and wants to test 
// it by time-traveling to visit Russia on the Day of the Programmer 
// (the 256th day of the year) during a year in the inclusive range from 1700 to 2700.

public static String dayOfProgrammer(int year) {
    // Write your code here
    int p = 256;
    int sum = 0;
    int diff = 0;
    int m[] = new int[]{31,28,31,30,31,30,31,31};
    if(year==1918) return "26.09."+Integer.toString(year);
    if(year<=1917){
        if(year%4==0) 
            m[1] = 29;
    } 
    if(year%4 == 0 && year%100 != 0 || year%400 == 0){
        m[1] = 29;
    }
    for(int a: m){
        sum+=a;
    }
    diff=p-sum;
 
 return Integer.toString(diff)+".09."+Integer.toString(year);

    }

}