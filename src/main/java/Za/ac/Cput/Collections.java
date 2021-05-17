package Za.ac.Cput;

/**
 * Honest Mpungu!
 * Student Number 215072081
 * Part-Time group
 * Individual Assignment
 */

import java.util.*;
public class Collections  {
    public static void main(String args[]){
        Collection<String> value =new PriorityQueue<String>();
        // creating priority queue

        value.add("sausages");
        // adding elements
        value.add("eggs");
        value.add("bread");
        value.add("mushrooms");
        value.add("tomatoes");
        value.add("bacon");
        value.add("jam");
        value.add("potatoes");

        System.out.println("Head:"+value.add("Breakfast Items"));

        System.out.println("iterating the queue elements:");
        Iterator itr=value.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        value.remove("tomatoes");
        ((PriorityQueue<String>) value).poll();
        System.out.println("after removing one element namely tomatoes:");
        Iterator<String> itr2=value.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

    }
}
