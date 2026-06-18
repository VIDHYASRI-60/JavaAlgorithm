package LinkedList;

public class LinkedListAtEnd {
	Node head;

//insert at end
	void InsertAtEnd(int data) {
		Node newNode = new Node(data);
		//check list is empty
	    if (head == null) {
	        head = newNode; //we can also call insert at begining...
	        return;
	    }
	    //traverse to last and add last
	    Node temp = head;
	    while (temp.next != null) {
	        temp = temp.next;
	    }
	    temp.next = newNode;
	}
	
//print
	
	void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
//Delete at end
	void deleteAtEnd() {
	    // Case 1: empty list
	    if (head == null) {
	        System.out.println("List is empty");
	        return;
	    }
	    // Case 2: only one node
	    if (head.next == null) {
	        head = null;
	        return;
	    }
	    //to delete element at end
	    Node temp = head;
	    // move to second last node
	    while (temp.next.next != null) {
	        temp = temp.next;
	    }

	    // delete last node
	    temp.next = null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListAtEnd le = new LinkedListAtEnd();

        le.InsertAtEnd(10);
        le.InsertAtEnd(20);
        le.InsertAtEnd(30);
        le.InsertAtEnd(40);
        le.display();
        le.deleteAtEnd();
        le.deleteAtEnd();
        le.display();
        


	}}
