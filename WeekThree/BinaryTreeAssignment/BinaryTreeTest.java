package WeekThree.BinaryTreeAssignment;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {
    private BinaryTree tree;

    @Before
    public void setUp() {
        tree = new BinaryTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(5);
        tree.insert(15);
    }

    @Test
    public void testInsertAndPreOrder() {
        assertEquals("10 5 20 15 30 ", tree.preOrder());
    }

    @Test
    public void testFindMin() {
        assertEquals(5, tree.findMin());
    }

    @Test
    public void testNodesGT() {
        assertEquals(1, tree.NodesGT(20));
    }

    @Test
    public void testAverage() {
        double delta = 0.0001; // for floating point comparisons
        assertEquals(16.0, tree.average(), delta);
    }

    @Test
    public void testBalanceHeight() {
        assertEquals(3, tree.balanceHeight());
    }
}
