package Searching;

public class BinaryRec {
	
		static int binarySearch(int[] arr, int low, int high, int target) {
			if(low>high)
				return -1;
			
			int mid = low +(high - low)/2;
			if(arr[mid] == target)
				return mid;
			if(target < arr[mid])
				return binarySearch(arr, low, mid-1, target);
			return binarySearch(arr, mid+1, high, target);
		}
		public static void main(String[] args) {
			int[] arr = {10,20,30,40,50,60};
			System.out.println("Index of 40 :" + binarySearch(arr,0,arr.length-1, 40)); 
			System.out.println("Index of 80 :" + binarySearch(arr,0,arr.length-1, 80)); 
			System.out.println("Index of 10 :" + binarySearch(arr,0,arr.length-1, 10)); 

		}

	}


