// problem link:

// https://www.hackerrank.com/challenges/insertionsort1/problem?h_r=next-challenge&h_v=zen&isFullScreen=true



public static void insertionSort1(int n, List<Integer> arr) {
    // Write your code here
    int rightMostele = arr.get(n-1);
    int j=n-2;
    while(j>=0 && arr.get(j)>rightMostele){
        int val = arr.get(j);
        arr.set(j+1,val);
        for(Integer num:arr){
            System.out.print(num+" ");
            
        }
        System.out.println();
        j--;
    }
    arr.set(j+1,rightMostele);
    for(Integer num:arr){
            System.out.print(num+" ");
            
        }
    }
}