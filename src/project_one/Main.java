package project_one;

import java.util.Arrays;

public class Main {
	
	 // Function to sort a binary array in linear time
    public static void sort(int[] A)
    {
        int pivot = 1;
        int j = 0;
 
        // each time we encounter a 0, `j` is incremented, and
        // 0 is placed before the pivot
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] < pivot)
            {
                swap(A, i, j);
                j++;
            }
        }
    }
 
    // Utility function to swap elements at two indices in the given array
    private static void swap(int[] A, int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
 
    public static void main (String[] args)
    {
        int[] A = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
 
        sort(A);
 
        // print the rearranged array
        System.out.println(Arrays.toString(A));
    }
}
	

		
		
		
	
	

	
	
		
	
	
	


