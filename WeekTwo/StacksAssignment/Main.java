package WeekTwo.StacksAssignment;
import java.util.Stack;

class Main {

  /*
   * Main Driver for personalized testing. 
   * 
   * Do *NOT* forget to run the supplied tests before submitting this work.
   * They are located under the tools panel (on the left) undcer tests.
   */
  
  public static void main(String[] args) {
    String testString = "1232";
    System.out.println(Stacks.isPalindrome(testString));

    Stack<Integer> myStack = new Stack<>();
    myStack.push(5);
    myStack.push(3);
    myStack.push(1);
    myStack.push(4);
    myStack.push(1);

    System.out.println(myStack);
    System.out.println(Stacks.findLargestK(myStack, 1));
  }
}