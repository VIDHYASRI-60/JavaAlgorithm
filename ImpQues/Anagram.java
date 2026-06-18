package ImpQues;
import java.util.Arrays;
import java.util.Scanner;

//Built in
/*
public class Anagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);

		        String s1 = sc.next();
		        String s2 = sc.next();

		        char a[] = s1.toCharArray();
		        char b[] = s2.toCharArray();

		        Arrays.sort(a);
		        Arrays.sort(b);

		        if(Arrays.equals(a,b))
		            System.out.println("Anagram");
		        else
		            System.out.println("Not Anagram");
		    }
		}
	*/

//without BuiltIn

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        if(s1.length() != s2.length()) {
            System.out.println("False");
            return;
        }

        int count[] = new int[256];

        for(int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for(int i = 0; i < 256; i++) {
            if(count[i] != 0) {
                System.out.println("False");
                return;
            }
        }

        System.out.println("True");
    }
}