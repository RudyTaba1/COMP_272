package WeekThree.BinaryTreeAssignment;

////////////////////////////////////////////
// rtabachnik / COMP 272-002              //
////////////////////////////////////////////


/*
 * Class BinaryTree
 *
 * Simple Binary Search Tree. 
 */

public class BinaryTree {

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(Node node) {
        root = node;
    }


    /*
     * Class Node
     *
     * This class represents a node in a binary tree. Each node has a 
     * data value alonge with left and right children pointers. 
     */
  
    public class Node {

        Node( int d) {
          data = d;
          left = null;
          right = null;
        }
      
        Node(int d, Node l, Node r) {
            data = d;
            left = l;
            right = r;
        }

        public int data;
        public Node left;
        public Node right;
    }

    public  Node root;

    public  void deleteTree()                 { root = null; }
    public  Node insert(int data)             { return insert(root, data); }

    /*
     * Method Insert
     *
     * This method inserts a new node into the binary search tree. It
     * returns a pointer to the node that was added in the tree.
     */
  
    private Node insert(Node node, int value) {

        // Empty tree scenario; create it's first node. 
        if ( root == null ) {
            return root = new Node(value, null, null);
        }

        // If 'node' is null, we found the location to insert the new node, 
        // else recursively traverse tree to identify location to insert. 
      
        if ( node == null ) {
            node = new Node(value, null, null);
        } else  if (value > node.data) {
            node.right = insert(node.right, value);  // recursively traverse right
        }
        else if (value < node.data) {
            node.left = insert(node.left, value);    // recursively travser left
        }
      
        return node;
  }

  // Below can be used by println, e.g., System.out.println(tree);
  // where tree is a BinaryTree object. The JUnit tests also use these 
  // methods, so do not modify.
  
  public String toString() {
      return toStringHelper(root);
  }

  private String toStringHelper(Node n) {
      if (n == null) {
          return "";
      }
      return n.data + " " + toStringHelper(n.left) + toStringHelper(n.right);
  }


  
  /***********************************************************
   *
   * YOUR CODE GOES BELOW
   *
   * THERE IS NO NEED TO CHANGE THE CODE ABOVE. DO NOT FORGET TO PLACE
   * YOUR NAME AND SECTION NUMBER ABOVE. ANY UNIT TESTING YOU DO
   * SHOULD BE DONE IN MAIN().
   *
   *
   * YOU ARE TO WRITE THE METHODS:
   *    - preOrder
   *    - findMin
   *    - NodesGT
   *    - average
   *    - balanceHeight
   *
   ***********************************************************/
   
   /**
    * Helper method for preOrder
    * @param n - Node
    * @return recursively returns the preOrder traversal of the tree
    */
   
   private String preOrderHelper(Node n) {
        if (n == null) {
            return "";
        }
        return n.data + " " + preOrderHelper(n.left) + preOrderHelper(n.right);
    }
  
    public String preOrder() {
        return preOrderHelper(root);
    }


    public int findMin() {
        return Integer.MAX_VALUE;
    }
        

    public int NodesGT(int val) {
    	return 0;
    }

    
    public double average() {
        return (double) 0.0;
    }


    public int balanceHeight() {
        return -1;
    }

}
