// This module shift elements one position right to the ArrayList

package exercise_8;

import java.util.*;

public class shiftElements {
    public static ArrayList<String> shifting (ArrayList<String> list){
        // Prevent the case that the user gives a null ArrayList
        if (list == null || list.isEmpty()){
            return list;
        }

        String lastValue = list.get(list.size() - 1);

        for (int i = list.size() - 1; i>0; i--){
            list.set(i, list.get(i - 1));
        }

        list.set(0, lastValue);

        return list;
    }
}
