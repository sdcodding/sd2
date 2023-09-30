package project_one;

import java.util.Arrays;

public class FindPair {

	
	public static void find(int arr[], int target) {
		
		Arrays.sort(arr);
		int small=arr[0];
		int large=arr.length-1;
		int temp=0;
		
		while(small<large) {
			if(arr[small]+arr[large]==target){
				
				System.out.println(small+"+"+large+"="+target);
				temp=temp+1;
				
			}
			
			if(arr[small]+arr[large]<target) {
				small++;				
			}
			else {
				large--;
				
			}
			
			
		}
		if(temp==0) {
			System.out.println("pair not found");
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {2,5,8,1,0,3,6,4};
		int target=11;
		find(arr, target);
		
		
	}
	
}


