// Given an ArrayList of Strings, shift all elements one place to the right and return the ArrayList.
// The last element should be shifted to the first element.

package exercise_8;

import java.util.ArrayList;

    public class mainProgram {
    public static void main (String args[])
    {
        ArrayList<String> list = new ArrayList<>();
        
        // Adding elements to the 1st ArrayList
        list.add("A");
        list.add("L");
        list.add("E");
        list.add("X");

        System.out.println("At first the ArrayList was: " + list);

        ArrayList<String> resultList = shiftElements.shifting(list);
        
        System.out.println("After the shifting the ArrayList became: " + resultList);

    }        
}
