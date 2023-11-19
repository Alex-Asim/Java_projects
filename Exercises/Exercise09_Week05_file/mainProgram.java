// Given a doubly-linked list (default Java implementation), rotate the linked list counter-clockwise by N nodes.
// Here N is a given positive integer and is smaller than the count of nodes in linked list.

import java.util.LinkedList;

public class mainProgram {
    public static void main(String [] arg){
        
        LinkedList<Integer> DLl = new LinkedList<Integer>();

        // DLl means Doubly Linked list
        
        DLl.add(1);
        DLl.add(2);
        DLl.add(3);
        DLl.add(4);

        // If we want to add something at the begining of the list we use the following command 
        // DLl.addFirst("Add this element to the begging");

        // If we want to add something to the first position we use the following command 
        // DLl.push("First position");

        // If we want to adding something to the end of the List
        // DLl.offer("The end");

        // If we use pop method, we take the first element of the list and we remove it.
        // System.out.println("I used pop function " + DLl.pop());

        // If we use poll we take the element form the list. For example:
        // System.out.println(DLl.pollFirst());
        // System.out.println(DLl.pollLast());

        int N = 3;
        int i = 0;

        if (N < DLl.size()){
            while (i<N){
                DLl.addLast(DLl.removeFirst());
                i++;
            }
            System.out.println(DLl);
        }
        else{
            System.out.println("The number you gave is greater than the size of the Doubly Linked List! Try another!");
        }
    }
    
}
