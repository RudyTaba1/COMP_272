package StacksAssignment;
import java.util.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;


public class StacksTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(Stacks.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(Stacks.isPalindrome("Able , was I saw elba"));
        assertTrue(Stacks.isPalindrome("Madam, in Eden, I'm Adam"));
        assertTrue(Stacks.isPalindrome("Was it a car or a cat I saw?"));
        assertTrue(Stacks.isPalindrome("Able was I ere I saw Elba"));
        assertTrue(Stacks.isPalindrome("racecar"));
        assertTrue(Stacks.isPalindrome(" "));
        assertTrue(Stacks.isPalindrome(""));
        assertFalse(Stacks.isPalindrome("This is not a palindrome"));
        assertFalse(Stacks.isPalindrome("This is a palindrome"));
        assertTrue(Stacks.isPalindrome("12321"));
        assertTrue(Stacks.isPalindrome("123321"));
        assertTrue(Stacks.isPalindrome("1234321"));
        assertFalse(Stacks.isPalindrome("123456"));
    }

    @Test
    public void testFindLargestK() {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(5);
        myStack.push(3);
        myStack.push(1);
        myStack.push(4);
        myStack.push(1);
        assertEquals(4, Stacks.findLargestK(myStack, 1));
        assertEquals(-1, Stacks.findLargestK(myStack, 2));
        assertEquals(1, Stacks.findLargestK(myStack, 3));
        assertEquals(3, Stacks.findLargestK(myStack, 4));
        assertEquals(0, Stacks.findLargestK(myStack, 5));
    }

}