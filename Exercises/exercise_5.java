// Write a Java program to compare two array lists

import java.util.*;

public class exercise_5 {
    public static void main (String args[])
    {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> otherlist = new ArrayList<String>();
        
        // Adding elements to the 1st ArrayList
        list.add("C");
        list.add("A");
        list.add("T");

        // Adding elements to the 2nd ArrayList
        otherlist.add("D");
        otherlist.add("O");
        otherlist.add("G");

        // Sort both of the ArrayList
        Collections.sort(list);
        Collections.sort(otherlist);

        // Comparison procedure between two ArrayList
        boolean comp_are = list.equals(otherlist);

        // Printing the result of the comparison
        System.out.println(comp_are);
    }   
}
