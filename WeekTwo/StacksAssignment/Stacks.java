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
        
        Stack<Character> checkPali = new Stack<>();
        boolean isPalindrome = checkPali.isEmpty();
        winput = winput.toLowerCase().replaceAll(" ", "");

        //pushes the first half of the string onto the stack to account for odd length strings
        for(int i = 0; i < (winput.length()/2); i++){
            checkPali.push(winput.charAt(i));
        }

        //accounts for odd length strings by starting the index at the middle of the string
        int startIndex = (winput.length()/2) + (winput.length()%2);
        

        for(int i = startIndex; i < winput.length(); i++){
            
            //in other words, if checkPali[i-1] == winput[i], then it is a palindrome (which is true)
            if(checkPali.pop() == winput.charAt(i)){
                isPalindrome = true;
            }
        }


/*      boolean isPalindrome = false;
        
        winput = winput.toLowerCase().replaceAll(" ", "");
        String reverse = "";

        for(int i = winput.length() - 1; i >= 0; i--){
            reverse += winput.charAt(i);
        }
            if(winput.equals(reverse)){
                isPalindrome = true;
            }   
*/
            // YOR CODE CODE HERE, *USE* A STACK IMPLEMENTATION
  
        return isPalindrome;
    }

    public static int findLargestK(Stack<Integer> stack, int k) {

        // YOUR CODE GOES HERE, DO NOT FORGET TO ADD YOUR 
        // NAME AND SECTION NUMBER AT TOP OF THIS FILE
      
        return -1;

    }
}
