package Za.ac.Cput;
/**
 * Honest Mpungu!
 * Student Number 215072081
 * Part-Time group
 * Individual Assignment
 */


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Map {

    public static void main(String[] args) {


        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(1, "Beans 1");
        mp.put(2, "bacon 2");
        mp.put(3, "Eggs 3");
        mp.put(4, "Mushrooms 4 ");
        mp.put(5, "Pork bangers");
        mp.put(6, "Sausages 6 ");
        mp.put(7, "Bread 7");


        System.out.println(mp);


        Iterator<Integer> iterator = mp.keySet().iterator();
        if (iterator.hasNext()) {
            do {
                Integer key = iterator.next();
                if (key != 6) {
                    iterator.remove();
                }
            }
            while (iterator.hasNext());
        }
    }
}
