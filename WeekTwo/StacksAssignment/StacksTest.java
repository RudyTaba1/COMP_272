package WeekTwo.StacksAssignment;
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
}