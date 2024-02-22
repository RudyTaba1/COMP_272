package WeekFour.TreeAssignment;

import java.util.*;

public class TreeProblems {

  /*
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are not in both sets. In otherwords, return a TreeSet of all the 
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
    //
    // Use the TreeSet methods to return the correct set. This can
    // be done with only *several* lines of code by creating two temporary
    // TreeSets and using the methods retainAll(), addAll(), and removeAll(). 
    // But in the end, get something to work. 

    //create a new TreeSet to store the result
TreeSet<Integer> result = new TreeSet<>(setA);
      //add all elements from setB to result
      result.addAll(setB);
        //create a new TreeSet to store the intersection of setA and setB
        TreeSet<Integer> intersection = new TreeSet<>(setA);
        //retain only the elements that are in both setA and setB
        intersection.retainAll(setB);
        //remove all elements that are in the intersection from the result
        result.removeAll(intersection);

        return result;
  }

  


  /*
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    // INSERT CODE HERE. The simpliest way to create a TreeMap iterator object
    // and loop through the map removing even numbers. This approach will only
    // use several lines of code. 
    Iterator<Integer> it = treeMap.keySet().iterator();
    while (it.hasNext()) {
      if (it.next() % 2 == 0) {
        it.remove();
      }
    }

  }

}
