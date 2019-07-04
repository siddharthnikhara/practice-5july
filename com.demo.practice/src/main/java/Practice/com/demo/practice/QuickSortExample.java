package Practice.com.demo.practice;

public class QuickSortExample {
	//10, 7, 8, 9, 1, 5
	 int partition(int arr[], int low, int high) 
	    { 
	        int pivot = arr[high];  
	        int i = (low-1); // index of smaller element 
	        for (int j=low; j<high; j++) 
	        { 
	            // If current element is smaller than or 
	            // equal to pivot 
	            if (arr[j] <= pivot) 
	            { 
	                i++; 
	                	System.out.print(i+"  ;"+j);
	                // swap arr[i] and arr[j] 
	                int temp = arr[i]; 
	                arr[i] = arr[j]; 
	                arr[j] = temp; 
	            } 
	        } 
	  
	        // swap arr[i+1] and arr[high] (or pivot) 
	        int temp = arr[i+1]; 
	        arr[i+1] = arr[high]; 
	        arr[high] = temp; 
	  
	        return i+1; 
	    } 
	  
	  
	    /* The main function that implements QuickSort() 
	      arr[] --> Array to be sorted, 
	      low  --> Starting index, 
	      high  --> Ending index */
	    void sort(int arr[], int low, int high) 
	    { 
	        if (low < high) 
	        { 
	            /* pi is partitioning index, arr[pi] is  
	              now at right place */
	            int pi = partition(arr, low, high); 
	  
	            // Recursively sort elements before 
	            // partition and after partition 
	            sort(arr, low, pi-1); 
	            sort(arr, pi+1, high); 
	        } 
	    } 
	  
	    // Driver program 
	    public static void main(String args[]) 
	    { 
	        int arr[] = {10, 7, 8, 9, 1, 5}; 
	        int n = arr.length; 
	  
	        QuickSortExample ob = new QuickSortExample(); 
	        ob.sort(arr, 0, n-1); 
	  
	        System.out.println("sorted array"); 
	       for(int i:arr) {
	    	   System.out.print(i+" ,");
	       }
	    } 
	} 

