package Searching;


//2d Linear
public class TwoDLinear {

		    static int[] search(int[][] arr, int target) {

		        for(int i = 0; i < arr.length; i++) {

		            for(int j = 0; j < arr[i].length; j++) {

		                if(arr[i][j] == target) {
		                    return new int[]{i, j};
		                }
		            }
		        }

		        return new int[]{-1, -1};
		    }

		    public static void main(String[] args) {

		        int[][] arr = {
		            {10, 20, 30},
		            {40, 50, 60},
		            {70, 80, 90}
		        };

		        int target = 80;

		        int[] ans = search(arr, target);

		        System.out.println("i = " + ans[0]);
		        System.out.println("j = " + ans[1]);
		    }
		

}
