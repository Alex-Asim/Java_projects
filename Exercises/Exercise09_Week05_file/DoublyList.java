import java.util.*;

public class DoublyList{
    public class Node{
        int data;
        Node previous;
        Node next;

        public Node(int data){
            this.data = data;
        }
}
    
    Node head, tail = null;

    // How to add Nodes to a Double Linked List
    public void addNode(int data){
        Node newNode = new Node(data);

        //In case the list is empty, head and tail points to addNode  
        if(head == null) {  
            head = tail = newNode;  
            //head's previous will be null  
            head.previous = null;  
            //tail's next will be null  
            tail.next = null;  
        }  
        else {  
            //add newNode to the end of list. tail->next set to newNode  
            tail.next = newNode;  
            //newNode->previous set to tail  
            newNode.previous = tail;  
            //newNode becomes new tail  
            tail = newNode;  
             //tail's next point to null  
            tail.next = null;  
        }
    }

    //Print all the nodes of doubly linked list  
    public void printNodes(int N) {  
        //Node current will point to head  
        // int length = 0;
        Node current = head;
        // Node.current = current + N;  
        if(head == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        
        System.out.println("Nodes of doubly linked list: ");  
        
        while(current != null) {  
            //Print each node and then go to next.  
            // current = current + N;
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }

    public int countNodes(int N){
        // Initiate the counter of the number of Nodes
        int counter  = N;
        // This counter must at the beggining point to head
        Node pointer = head;

        while (pointer != null){
            counter ++;
            pointer = pointer.next;
        } 
        return counter;
    }
}
