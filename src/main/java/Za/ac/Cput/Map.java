    package Za.ac.Cput;

/**
 * Honest Mpungu!
 * Student Number 215072081
 * Part-Time group
 * Group AssignmentG
 */

    import org.junit.Test;

    import java.util.HashMap;
    import java.util.Iterator;

    public class Map {

        @Test
        public void test() {

            HashMap<Integer, String> map = new HashMap<>();
            map.put(1, "Beans 1");
            map.put(2, "bacon 2");
            map.put(3, "Eggs 3");
            map.put(4, "Mushrooms 4 ");
            map.put(5, "Pork bangers");
            map.put(6, "Sausages 6 ");
            map.put(7, "Bread 7");

            System.out.println(map);


            Iterator<Integer> iterator = map.keySet().iterator();
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