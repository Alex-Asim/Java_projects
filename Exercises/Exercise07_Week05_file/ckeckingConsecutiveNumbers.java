package exercise_7;
// Creating a class for checking consecutive elements
import java.util.*;

public class ckeckingConsecutiveNumbers{
    public static boolean hasConsecutive(ArrayList<Integer> list){
        
        // Sorting Arraylist
        Collections.sort(list);

        for (int i=0; i<list.size() - 1; i++)
        {
            if (list.get(i).equals(list.get(i+1)))
            {
                return true;
            }
        }
        return false;
    }
}
