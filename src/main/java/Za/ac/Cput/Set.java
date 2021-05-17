package Za.ac.Cput;


/**
 * Honest Mpungu!
 * Student Number 215072081
 * Part-Time group
 * Individual Assignment
 */


import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

    public class Set {


        public static void main(String[] args) {

            HashSet<String> set = new HashSet<String>();
            TreeSet<String> set1 = new TreeSet<>();

            //data is not added as in indexing approach
            //HashCodes for elements are being added
            set.add("bread");
            set.add("beans");
            set.add("mushrooms");
            set.add("tomatoes");
            set.add("jam");
            set.add("Sausages");
            set.add("bacon");


            //Data is unique,
            // no redundancy,
            //System.out.println("Set is:"+set);

            Iterator<String> itr = set.iterator();
            while(itr.hasNext()) {
                String str = itr.next();
                System.out.println(str);
            }
            set.remove("jam");
            System.out.println("after removing jam from the set:"+set);

            //if(set.contains("tomatoes")) {
            //System.out.println(" tomatoes is in the set ");

        }
    }






