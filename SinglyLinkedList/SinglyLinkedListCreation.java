package LinkedList;

//creating node and printing
public class SinglyLinkedListCreation {

	public static void main(String[] args) {
		
		Node first=new Node(10);
		Node second=new Node(20);
		Node third =new Node(30);
		
		first.next=second;
		second.next=third;
		
		Node temp=first;
		while(temp!=null) {
			System.out.print(temp.data+ "-->");
			temp=temp.next;
			
		}
		System.out.print("null");
		

	}

}
