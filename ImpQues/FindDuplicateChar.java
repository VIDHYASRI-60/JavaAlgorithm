package ImpQues;
import java.util.Scanner;
public class FindDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);

		        String str = sc.next();

		        for(int i=0;i<str.length();i++) {

		            int count = 0;

		            for(int j=i+1;j<str.length();j++) {

		                if(str.charAt(i)==str.charAt(j))
		                    count++;
		            }

		            if(count>0)
		                System.out.print(str.charAt(i) + " ");
		        }
		    }
		
}
