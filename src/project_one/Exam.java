package project_one;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Exam {
	
	public static void get(int [] arr) {
		
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			int target=0;
			
			for (int j = i; j < arr.length; j++) {
				
				target+=arr[j];
				if (target==0) {
					
					System.out.print("  from index number"+i+"to"+j+"-->");
					for (int j2 = i; j2 <=j; j2++) {
						System.out.print("at index"+"("+j2+")"+"="+arr[j2]+",");
					}
					
				}
				
				
					
					
				}
			
				
				
			}
			
			
			
		}
		
				
	public static void main(String[] args) {
		int[]arr= {-1,2,1,-2,3,-3,4,1,-5};
		
		get(arr);
		
	}
	
	
	}


