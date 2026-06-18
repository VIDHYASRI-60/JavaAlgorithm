package LinkedList;


public class LinkedListAtBegin {
	Node head;
	
//insert at begin
	void InserAtBegin(int data) {
		Node newnode=new Node(data);
		newnode.next=head;
		head=newnode;
	}
	
//delete at begin
	void DeleteAtBegin() {
		if(head ==null) {
			System.out.print("list is empty");
			return;
		}
		head=head.next;
	}
	
//for display
	void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			LinkedListAtBegin li=new LinkedListAtBegin();
			li.InserAtBegin(10);
			li.InserAtBegin(20);
			li.display();
			li.InserAtBegin(30);
			li.display();
			li.DeleteAtBegin();
		}
	
}