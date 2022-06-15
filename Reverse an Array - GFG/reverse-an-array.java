/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    for(int k=0; k<n/2; k++){
		        arr[k] += arr[n-1-k];
		        arr[n-1-k] = arr[k] - arr[n-1-k];
		        arr[k] = arr[k] - arr[n-1-k];
		    }
		    
		    for(int j=0; j<n; j++){
		        System.out.print(arr[j] + " ");
		    }
		    System.out.println();
		    
		}
		
	}
}