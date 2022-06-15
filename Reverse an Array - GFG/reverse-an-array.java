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
		    for(int i=n-1; i>=0; i--){
		        arr[i] = sc.nextInt();
		    }
		    
		    for(int j=0; j<n; j++){
		        System.out.print(arr[j] + " ");
		    }
		    System.out.println();
		    
		}
		
	}
}