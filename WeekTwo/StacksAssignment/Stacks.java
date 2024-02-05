package WeekTwo.StacksAssignment;
import java.util.Stack;

////////////////////////////////////////////
// Rudy Tabachnik / COMP 272-002          //
////////////////////////////////////////////


/*
 * Class: Stacks
 * 
 * You are to wrote the code for both methods. Please see the
 * instructions on the supplied PDF for assignment # 1. It provides
 * the specifications for each method.
 */

public class Stacks {

    /**
     *  check if the input string by a user is a palindrome (a word or sentence that is spelled the same in reverse as it is spelled
        straightforward). This method should work irrespective of spaces and casing. Example: the method should return true for “Race Car” and “racecar”. 
     * @param winput - the input string.
     * @return isPalindrome - true if the input string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String winput) {
        
        //Stack<String> checkPali = new Stack<String>();
        //boolean isPalindrome = checkPali.isEmpty();

        boolean isPalindrome = false;
        
        winput = winput.toLowerCase().replaceAll(" ", "");
        String reverse = "";

        for(int i = winput.length() - 1; i >= 0; i--){
            reverse += winput.charAt(i);
        }
            if(winput.equals(reverse)){
                isPalindrome = true;
            }   
        // YOR CODE CODE HERE, *USE* A STACK IMPLEMENTATION
  
        return isPalindrome;
    }

    public static int findLargestK(Stack<Integer> stack, int k) {

        // YOUR CODE GOES HERE, DO NOT FORGET TO ADD YOUR 
        // NAME AND SECTION NUMBER AT TOP OF THIS FILE
      
        return -1;

    }
}
