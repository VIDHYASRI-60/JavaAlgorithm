package Searching;

/*public class BinarySearch {
	public static int binary(int[] arr, int target) {
		int low=0;
		int high =arr.length -1;
		
		while(low<=high) {
			int mid=low+(high - low)/2;
			if(arr[mid]== target) {
				return mid;
			}
			else if(arr[mid]<target) {
				low=mid+1;
				
			}
			else {
				high=mid-1;
			}
		}
		return -1;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {23,34,45,56,67,89};
		int target=56;
		int result=binary(arr,target);
		System.out.print(result);
	}

}*/



//Ascending or descending....


public class BinarySearch{
	static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length -1;
		
		if(arr[low] < arr[high]) {
			while(low <=high) {
				int mid = low + (high - low)/2;
				if(arr[mid] == target) 
					return mid;
				else if(target < arr[mid])
					high = mid-1;
				else
					low= mid +1;				
			}
		}
		else {
			while(low <=high) {
				int mid = low + (high - low)/2;
				if(arr[mid] == target) 
					return mid;
				else if(target > arr[mid])
					high = mid-1;
				else
					low= mid +1;	
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60};
		System.out.println("Index of 40 :" + binarySearch(arr, 40)); //TC-O(log N)
		System.out.println("Index of 80 :" + binarySearch(arr, 80)); //TC-O(log N)
		System.out.println("Index of 10 :" + binarySearch(arr, 10)); //TC-O(1)
		
		int [] brr = {5, 4, 3, 2, 1, 0};
		System.out.println("Index of 5 : "+binarySearch(brr, 5)); 
		System.out.println("Index of 1 : "+binarySearch(brr, 1)); 
		System.out.println("Index of 6 : "+binarySearch(brr, 6)); 
	}

	
}
