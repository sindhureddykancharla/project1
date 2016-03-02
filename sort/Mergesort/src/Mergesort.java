
	import java.util.*;

	class Mergesort {
		 
	      static public void Merge(int [] numbers, int left, int mid, int right)
	      {
	        int [] recc = new int[25];
	        int i, left_end, num_elements, tmp_pos;
	    
	        left_end = (mid - 1);
	        tmp_pos = left;
	        num_elements = (right - left + 1);
	    
	        while ((left <= left_end) && (mid <= right))
	        {
	            if (numbers[left] <= numbers[mid])
	                recc[tmp_pos++] = numbers[left++];
	            else
	                recc[tmp_pos++] = numbers[mid++];
	        }
	    
	        while (left <= left_end)
	            recc[tmp_pos++] = numbers[left++];
	 
	        while (mid <= right)
	            recc[tmp_pos++] = numbers[mid++];
	 
	        for (i = 0; i < num_elements; i++)
	        {
	            numbers[right] = recc[right];
	            right--;
	        }
	    }
	 
	    static public void MergeSort_Recursive(int [] numbers, int left, int right)
	    {
	      int mid;
	    
	      if (right > left)
	      {
	        mid = (right + left) / 2;
	        MergeSort_Recursive(numbers, left, mid);
	        MergeSort_Recursive(numbers, (mid + 1), right);
	    
	        Merge(numbers, left, (mid+1), right);
	      }
	    }
	 
	 
	    public static void main(String[] args)
	      {
	        int[] numbers = { 3, 45, 7, 5, 2, 1, 9, 998, 4,3};
	        int length = 10;
	 
	  
	 
	        MergeSort_Recursive(numbers, 0, length - 1);
	        for (int i = 0; i < 10; i++)
	            System.out.println(numbers[i]);
	       
	    }
	}
