package project_one;

import java.util.Arrays;

public class Exam3 {
	public void get(int[]arr) {
		
		int i=0;
		for(int k:arr) {
			if(k==0) {
				arr[i++]=0;
				
			}			
		}
		for (int j = i; j < arr.length; j++) {
			arr[i++]=1;
			}
		
		
		
	}
	
	public static void main(String[] args) {
		int [] arr= {1,0,1,0,0,1,0,0,1};
		Exam3 sd=new Exam3();
		sd.get(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	

}
