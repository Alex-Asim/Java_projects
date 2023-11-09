package exercise_6;
// Write a method that takes 2 parameters: an ArrayList<String> list,
// and an int numRepeats representing the number of times to repeat each element in the array.
// Return a new ArrayList with each element repeated numRepeats times.

import java.util.*;

public class exercise_6 {
    public static void main (String args[])
    {
        ArrayList<String> list = new ArrayList<String>();
        
        // Adding elements to the 1st ArrayList
        list.add("Charis");
        list.add("Zwh");
        list.add("Maria");
        list.add("Andreas");

        // Initialize the number of repeats of each element.
        int numRepeats = 5;

        // The following line calls the method from the other file with specific arguments
        ArrayList<String> repeatedList = repeatListElements.repeatElements(list, numRepeats);

        System.out.println(repeatedList);
    }  
}
