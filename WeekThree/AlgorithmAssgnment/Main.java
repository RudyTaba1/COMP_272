package WeekThree.AlgorithmAssgnment;

////////////////////////////////////////////
// rtabachnik / COMP272-002               //
////////////////////////////////////////////

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    AlgorithmAnalysis3 algo = new AlgorithmAnalysis3();
    int[] numbers = {5, 3, 8, 1, 2, 4, 7, 6};
    

    System.out.println("Array being processed : " + Arrays.toString(numbers));
    algo.algorithmThree(numbers);

    
    /*
     * ENTER YOUR ANSWERS BELOW, DO NOT FORGET TO PLACE YOUR
     * NAME AND SECTIION NUMBER ABOVE.
     *
     * REPLACE WHAT IS IN BRACKETS <> BELOW WITH YOUR ANSWERS
     */ 

    System.out.println("\nAlgorithmThree Analysis:");
    System.out.println("Big-Oh is             : O(nlogn)");
    System.out.println("Big-Omega is          : Ω(nlogn)");
    System.out.println("Does Big-Theta exist? : <No> ");

  }
}


