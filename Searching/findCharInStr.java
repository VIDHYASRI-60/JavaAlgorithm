package Searching;

public class findCharInStr {

    static int search(String s, char target) {
    	
    	
        for(int i = 0; i < s.length(); i++) {
        	char ch=s.charAt(i);
            if(ch == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String s = "java";
        char target = 'v';

        int index = search(s, target);

        if(index != -1) {
            System.out.println("Character found at index " + index);
        } else {
            System.out.println("Not found");
        }
    }
}


