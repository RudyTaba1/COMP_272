package WeekThree.BinaryTreeAssignment;


/*
 * Your Unit Testing goes below. 
 */

public class Main {

  /*
   * Sample tests are included which excerise each of the method you
   * are to write. The expected return retults for each is also provided
   * based on each's tree setup.
   * 
   * You should also do your unit testing by changing the test scenarios
   * below. Good unit testing should cover edge cases. 
   * 
   * When you are ready to submit your assignment, don'd forget to run 
   * the replit tests under the tools panel. Think of this as running your 
   * code through system testing (black box testing) before publishing it. 
   */
  
  public static void main(String[] args) {
      BinaryTree tree = new BinaryTree();

      //
      // Sample Test 1: For this test, a sample tree is provided
      //         That looks like the following:
      //                5
      //              /   \
      //             3     7
      //            / \  
      //           2   4
      //
      //  The expected preorder output for this tree is "5 3 2 4 7"
      //
    
      tree.insert(5);
      tree.insert(3);
      tree.insert(7);
      tree.insert(2);
      tree.insert(4);
      System.out.println("Test 1: Preorder traversal: " + tree.preOrder());


      //
      // Sample Tests 2-4: For this test, a sample tree is provided
      //         That looks like the following:
      //                17
      //               /  \  
      //             5      47
      //              \    /  \
      //              11  23   99      
      //             /  
      //            8
      //              \
      //               9  
      //
      // The expected results on the println below are ....
      //                    Expected Minimal value : 5
      //                    # nodes w/ value GT    : 3
      //                    Average value          : 27.375
      //
      tree.deleteTree();
      tree.insert(17);
      tree.insert(47);
      tree.insert(5);
      tree.insert(23);
      tree.insert(99);
      tree.insert(11);
      tree.insert(8);
      tree.insert(9);
      System.out.println("Test 2: Minimal value       : " + tree.findMin());
      System.out.println("Test 3: # nodes w/ val GT   : " + tree.NodesGT(17));
      System.out.println("Test 4: Average value       : " + tree.average()); 

      // 
      // Sample Test 5: is 1st tree balanced?: Yes
      //         is 2nd tree balanced?: No
      //
    
      tree.deleteTree();
      tree.insert(5);
      tree.insert(3);
      tree.insert(7);
      tree.insert(2);
      System.out.println("Test 5: 1st tree balanced?  : " + 
                          (tree.balanceHeight() == -1 ? "No" : "Yes"));

      tree.deleteTree();
      tree.insert(5);
      tree.insert(3);
      tree.insert(7);
      tree.insert(2);
      tree.insert(8);
      tree.insert(9);
      System.out.println("Test 5: 2nd tree balanced?  : " + 
                          (tree.balanceHeight() == -1 ? "No" : "Yes"));
    
  }
}