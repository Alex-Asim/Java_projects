//Write a Java program to sort a given array list.

import java.util.*;

public class exercise_1{
    public static void main (String args[])
    {
        ArrayList<String> list = new ArrayList<String>();
        
        // Adding elements to the ArrayList
        list.add("Charis");
        list.add("Zwh");
        list.add("Maria");
        
        // Printing the elements before sorting
        System.out.println("Before sorting:" + list);

        // Sorting Arraylist
        Collections.sort(list);

        // Printing the sorted ArrayList
        System.out.println("After sorting procedure: "+ list);
    }
}
