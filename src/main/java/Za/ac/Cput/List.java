package Za.ac.Cput;

/**
 * Honest Mpungu!
 * Student Number 215072081
 * Part-Time group
 * Group AssignmentG
 */

import java.util.*;
import java.util.ArrayList;

public class List {


    public static void main(String[] args) {

        //List1 can only store String Objects
        ArrayList<String> list1 = new ArrayList<String>();

        //list2 can store any type of Object
        ArrayList list2 = new ArrayList();

        //1.adding data to the list
        list1.add(" Tomatoes");           //01
        list1.add(" Sausages");          //02
        list1.add(" Bread");            //03
        list1.add(" Jam");             //04
        list1.add("Pork bangers");    //05
        list1.add("Eggs");          //06

        list2.add("item 1");
        list2.add("item 2");
        list2.add("item 3");
        list2.add("item 4");
        list2.add("item 5");
        list2.add("item 6");

        System.out.println("list1 is :" + list1);
        System.out.println("list2 is :" + list2);


        //2. find the element from List
        String name = list1.get(04);
        System.out.println("name is :" + name);

        Object o = list2.get(04);
        System.out.println("o is: " + o);

        //list1.remove("jam");
        //list2.remove("Item 4");
        //System.out.println(" List after using removing item 4 namely jam ");
        // System.out.println("list1 is :"+list1);
        //System.out.println("list2 is :"+list2);

        ListIterator<String> iter = list1.listIterator();
        while (iter.hasNext()) {
            if ("Eggs ".equals(iter.next())) {
                iter.remove();
            }
        }

        System.out.println(list1);
        System.out.println(list2);


    }
}

