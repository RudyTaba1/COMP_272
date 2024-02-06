package ListsAssignment;
import ListsAssignment.LUCLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;


public class LinkedListTest {
    
        @Test
        public void testRemoveElementsLT(){
            LUCLinkedList list = new LUCLinkedList();
            list.insert(10);
            list.insert(20);
            list.insert(30); 
            list.insert(40);

            list.removeElementsLT(25);
            assertEquals("[30 40]", list.toString());

            LUCLinkedList emptyList = new LUCLinkedList();
            list.removeElementsLT(25);
            assertEquals("[]", emptyList.toString());

            LUCLinkedList AllLessThan = new LUCLinkedList();
            AllLessThan.insert(10);
            AllLessThan.insert(20);
            AllLessThan.insert(30);
            AllLessThan.insert(40);
            
            AllLessThan.removeElementsLT(50);
            assertEquals("[]", AllLessThan.toString());
        }

    
}
