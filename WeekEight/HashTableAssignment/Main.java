package HashTableAssignment;


import java.util.*;



/*
 *  Utility Methods Class
 * 
 *  This class contains utility methods that are used throughout 
 *  the program.
 */

class UtilMethods {

    /*
     * Hash Table Programming Exercise
     * 
     * Write a method that takes two arrays A and B, and returns
     * whether array B is a subset of array A. 
     *
     * USE a HashMap ADT to solve this problem.
     */
  
    public boolean isSubset(int list1[], int list2[]) {
      boolean isSub = true;  
      HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
      
      for(int i : list1){
        hm.put(i, hm.getOrDefault(i, 0) + 1);
      }
      
      for(int i : list2){
        if(hm.get(i) == null || hm.get(i) == 0 || !hm.containsKey(i)){
          isSub = false;
        }else {
          
          hm.put(i, hm.get(i) - 1);
        
        }

      }
        return isSub;
    }


   /*
    * Priority Queue 1 Programming Exercise
    *
    * Given an array A and integer k, return the k-th maximum
    * element in the array.
    * USE a Priority Queue ADT to solve this problem.
    */
  
   public int findKthLargest(int[] array, int k) {
    Queue<Integer> pq = new PriorityQueue<>();

    for (int val : array) {
        pq.add(val);
        if (pq.size() > k) {
            pq.poll();
        }
    }

    return pq.peek();
}

   /*
    * Priority Queue 2 Programming Exercise
    *
    * Given two arrays A and B with n and m integers respectively, 
    * return a singe sorted array of elements from both arrays.
    *
    * USE a Priority Queue ADT to solve this problem.
    */
  
    public int[] sort2Arrays(int[] array1, int[] array2) {
    if (array1 == null || array2 == null) {
        throw new IllegalArgumentException("Input arrays cannot be null");
    }

    Queue<Integer> pq = new PriorityQueue<>();
    int[] dummy = new int[array1.length + array2.length];
    for (int val : array1) {
        pq.add(val);
    }
    for (int val : array2) {
        pq.add(val);
    }
    int i = 0;
    while (!pq.isEmpty()) {
        dummy[i++] = pq.poll();
    }
    return Arrays.copyOf(dummy, i);
}
}


/*
 * Main Routine - Unit Testing 
 */

public class Main {

    public static void main(String[] args) {

      UtilMethods u = new UtilMethods();

      int list1[] = {10, 50, 35, 82, 13, 25};
      int list2[] = {10, 35, 13};
      int list3[] = {10, 35, 13, 8};

      // Sample HashTable isSubset() tests
      System.out.println("HashTable test, shoudl be true : "  
                         + u.isSubset(list1, list2));
      System.out.println("HashTable test, should be false: " 
                        + u.isSubset(list1, list3));

      
      // Sample PriorityQueue findKthLargest() tests
      int list4[] = {1,7,3,10,34,5,8};
      int k = 4;
      System.out.println("The " + k + " largest should be 7      : " 
                          + u.findKthLargest(list4, k));

      // Sample PriorityQueue sort2Arrays() tests
      int list5[] = {4,1,5};
      int list6[] = {3,2};
      int sorted[];
      
      sorted = u.sort2Arrays(list5, list6);

      System.out.print("Printing the combined sorted array: ");
      for (int i=0; i < sorted.length ; i++)
         System.out.print(sorted[i] + " ");
      System.out.println();
    }
}
