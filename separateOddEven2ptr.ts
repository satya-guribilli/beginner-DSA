/*Given an array Arr[], write a program that segregates even and odd numbers. The program should put all even numbers first in sorted order, and then odd numbers in sorted order.

Note :- You don't have to return the array, you just have to modify it in-place. */
//problem link     https://practice.geeksforgeeks.org/problems/segregate-even-and-odd-numbers4629/1

class Solution {
    void segregateEvenOdd(int arr[], int n) {
        // code here
        int l= 0;
        int r = n-1;
        while(l<r){
        while(l<r && arr[l]%2==0){
           l++;
        }
        while(l<r && arr[r]%2==1) r--;
        
        if(l<r ){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }
        }
        int counteven = 0;
        
        for(int i=0;i<n;i++){
            if(arr[i]%2==0) counteven++;
        }
        Arrays.sort(arr,0,counteven);
        Arrays.sort(arr,counteven,n);
    }
}