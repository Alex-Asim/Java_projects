package exercise_6;
// Implementation of a method that repeate each element of an ArrayList.

import java.util.*;

public class repeatListElements {
    public static ArrayList<String> repeatElements (ArrayList<String> list, int numRepeats){
        ArrayList<String> repeatedList = new ArrayList<>();

        for (String element : list){
            // Repeat numRepeats times each element of the ArrayList
            for (int i=0; i< numRepeats; i++){
                repeatedList.add(element);
            }
        }
        return repeatedList;
    }    
}
