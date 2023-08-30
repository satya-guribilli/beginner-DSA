/*Sum between the range of i to j (inclusive range) */




import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] sumarr = new int[n];
		int sum = 0;
		
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		    sum = sum+arr[i];
		    sumarr[i] = sum;
		}
		
		int q = sc.nextInt();
		while(q>0){
			int l = sc.nextInt();
			int r = sc.nextInt();
			int right = sumarr[r];
			int left = l==0?0: sumarr[l-1];
			int res = right-left;
			System.out.println(res);
			q--;
		}
		
		
	}
}