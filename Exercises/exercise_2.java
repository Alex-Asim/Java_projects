// Write a Java program to copy one array list into another.

import java.util.*;


public class exercise_2 {
    public static void main (String args[])
    {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> otherlist = new ArrayList<String>();
        
        // Adding elements to the 1st ArrayList
        list.add("Charis");
        list.add("Zwh");
        list.add("Maria");
        list.add("Andreas");

        // Adding elements to the 2nd ArrayList
        otherlist.add("Kostas");
        otherlist.add("Helen");
        otherlist.add("Alex");
        otherlist.add("George");

        // ArrayLists before copy
        System.out.println("The first list:" + list);
        System.out.println("The second list:" + otherlist);

        // Make otherlist contain the same values as list
        Collections.copy(otherlist, list);

        // ArrayList at the end
        System.out.println("The first list at the end:" + list);
        System.out.println("The second list at the end:" + otherlist);
    }
}
