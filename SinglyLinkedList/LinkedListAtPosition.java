package LinkedList;


public class LinkedListAtPosition {

    Node head;

 // Insert at position
    void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data);

        // Insert at beginning
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        // Move to (pos-1)th node
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // Invalid position
        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        // Insert node
        newNode.next = temp.next;
        temp.next = newNode;
    }

 // Display linked list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
    
    
    
 //delete at position
    
    void deleteAtPosition(int pos) {

        // Empty list
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Delete first node
        if (pos == 1) {
            head = head.next;
            return;
        }

        Node temp = head;

        // Move to (pos-1)th node
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // Invalid position
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        // Delete node
        temp.next = temp.next.next;
    }
    
    
    
//Delete by value
    
    void deleteByValue(int value) {

    	    // Empty list
    	    if (head == null) {
    	        System.out.println("List is empty");
    	        return;
    	    }

    	    // If value is in first node
    	    if (head.data == value) {
    	        head = head.next;
    	        return;
    	    }

    	    Node temp = head;

    	    // Find node before the value
    	    while (temp.next != null && temp.next.data != value) {
    	        temp = temp.next;
    	    }

    	    // Value not found
    	    if (temp.next == null) {
    	        System.out.println("Value not found");
    	        return;
    	    }

    	    // Delete node
    	    temp.next = temp.next.next;
    	}
    
//update At position
    
    void updateAtPosition(int pos, int newData) {
    //empty list
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        // Move to the required position
        for (int i = 1; i < pos && temp != null; i++) {
            temp = temp.next;
        }

        // Check if position is valid
        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        // Update data
        temp.data = newData;
    }
    
//update by value 
    
    void updatebyvalue(int oldvalue, int newvalue) {
    	//empty list
    	if (head == null) {
            System.out.println("List is empty");
            return;
    	}
    	//traversing 
    	 Node temp = head;

    	    while (temp != null) {
    	        if (temp.data == oldvalue) {
    	            temp.data = newvalue;
    	            return;
    	        }
    	        temp = temp.next;
    	    }
    	    //value not n list
    	    if(temp == null) {
    	    	System.out.print("value not found");
    	    }
    }

//COunt no of nodes
    int countNodes() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
    

//SEARCH A VALUE AND THEN RETURN ITS POSITION
   
    int Search(int value) {
    	Node temp=head;
    	int position =1;
    	while(temp!= null) {
    		if(temp.data==value) {
    			return position;
    		}
    		temp=temp.next;
    		position++;
    	}
    	return -1;
    }
    
 //REVERSE A LIST
    
   void Reverse() {
	   Node prev=null;
	   Node curr=head;
	   Node next=null;
	   while(curr !=null) {
		   next=curr.next;
		   curr.next=prev;
		   prev=curr;
		   curr=next;
	   }
	   head=prev;
   }
    
    
    public static void main(String[] args) {

        LinkedListAtPosition list = new LinkedListAtPosition();

        list.insertAtPosition(10, 1);
        list.insertAtPosition(20, 2);
        list.insertAtPosition(30, 3);
        

        System.out.println("Original List:");
        list.display();
        
        System.out.println("No of Nodes  :" +list.countNodes());
        
        System.out.println("Before Reverse:");
        list.display();
        list.Reverse();
        System.out.println("After Reverse:");
        list.display();
        
        
        System.out.println("Value 20 at position :" +list.Search(20));
        
        list.updateAtPosition(1, 15);
        list.display();
        
        list.deleteByValue(20);
        list.display();
        
        list.insertAtPosition(25, 3);

        System.out.println("After inserting 25 at position 3:");
        list.display();
        
        list.deleteAtPosition(3);
        System.out.println("After deleting ");
        list.display();
    }
}