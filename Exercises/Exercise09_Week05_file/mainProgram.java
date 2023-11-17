// Given a doubly-linked list (default Java implementation), rotate the linked list counter-clockwise by N nodes.
// Here N is a given positive integer and is smaller than the count of nodes in linked list.

import java.util.*;

public class mainProgram {
    public static void main(String[] args) {  
        //Create a DoublyLinkedList object
        DoublyList DLinkedList = new DoublyList();  
        
        //Add nodes to the list  
        DLinkedList.addNode(1);  
        DLinkedList.addNode(2);  
        DLinkedList.addNode(3);  
        DLinkedList.addNode(4);  
        DLinkedList.addNode(5);  
   
        int N = 2;
        //print the nodes of DoublyLinkedList  
        DLinkedList.printNodes(N);     

        System.out.println("Print the number of nodes: " + DLinkedList.countNodes(N));
    }  
}
