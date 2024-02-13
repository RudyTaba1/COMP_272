package WeekThree.BinaryTreeAssignment;
//my dislike for replit grows ever more
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
 

    /**
   * @return recursively returns the preOrder traversal of the tree
   */
    public String preOrder() {
        return preOrderHelper(root);
    }//method preOrder()
  

    /**
   * Helper method for findMin
   * @param n- root
   * @return recursively returns the minimum value in the tree
   */
    private int findMinHelper(Node n){
    //if node is empty, return it's max value (0)
        if(n == null){
      return Integer.MAX_VALUE;
    //recursevly find the minimum value by searching the left and right tree.
    //uses Math.min because it's easier than trying to build a conditional statement
    } else{
        return Math.min(n.data, Math.min(findMinHelper(n.left), findMinHelper(n.right)));
    }
  }//method findMinHelper()


    /**
    * returns the minimum value in the tree
    * @return recursively returns the minimum value in the tree
    */
    public int findMin() {
        return findMinHelper(root);
    }//method findMin()
        

    /**
     * Helper method for NodesGT 
     * @param n - root
     * @param val - value that we're looking to be greater than
     * @return amount of children that greater than @param val.
     */
    private int NodesGTHelper(Node n, int val){
        //if the tree is empty, return 0
        if(n == null){
            return 0;
        }
        //if the value of the node is greater than the value, return 1 + the sum of the left and right tree
        if(n.data > val){
            return 1 + NodesGTHelper(n.left, val) + NodesGTHelper(n.right, val);
        }
        //if the value of the node is less than the value, return the sum of the left and right tree
        else if(n.data < val){
            return NodesGTHelper(n.left, val) + NodesGTHelper(n.right, val);
        }
        //if the value of the node is equal to the value, return the sum of the left and right tree
        else{
            return NodesGTHelper(n.left, val) + NodesGTHelper(n.right, val);
        }
    }//method NodeGTHelper()
    
    
    /**
     * returns the number of nodes that are greater than @param val recursively.
     * @return gtsum.
     */
    public int NodesGT(int val) {
        return NodesGTHelper(root, val);
        }//method NodesGT()

   
    /**
 * Helper method to find the size of the binary tree
 * @param n - root
 * @return height of BinaryTree
 */
    private int getSize(Node n){
        if(n == null){
            return 0;
        }
        return 1 + getSize(n.left) + getSize(n.right);
    }//method getSize()


    /**
 * Helper method to find the total of the binary tree
 * @param n
 * @return total of the binary tree
 */
    private int averageHelper(Node n){
        //if the tree is empty, return 0
        if(n == null){
            return 0;
        }
        //return the average of all the data in the tree
        int total = n.data + averageHelper(n.left) + averageHelper(n.right);
        
        return total;
    }//method averageHelper()
    

    /**
 * returns the average of the binary tree
 * @return avg
 */
    public double average() {
        //I tried to calculate the average by using the getSize method, but it didn't work
        double size = getSize(root);
        return (double) averageHelper(root) / size;
    }


    /**
 * Helper method to check if the tree is balanced. The boolean does most of the work.
 * If it comes back balanced, then will return the size of the tree in the accessor method.
 * @param n - root.
 * @return balanced or notBalanced.
 */
private boolean isBalanced(Node n){
    //a lot easier on the eyes than true or false
    boolean balanced = true;
    boolean notBalanced = false;
    
    //if the tree is empty, return true
    if(n == null){
        return balanced;
    }
    if(Math.abs(height(n.left) - height(n.right)) > 1){
        return notBalanced;
    }

    return isBalanced(n.left) && isBalanced(n.right);
}//method isBalanced()
   
    
    /**
     * Helper method to find the height of the binary tree
     * @param n - root
     * @return height of BinaryTree
     */
   private int height(Node n){
        if(n == null){
            return 0;
        }
        return 1 + Math.max(height(n.left), height(n.right));
    }//method height()
    
    
    /**
     * accessor for isBalanced method.
     * if the tree is balanced, @return the size of the tree.
     * if not, @return -1.
     */
    public int balanceHeight() {
        int fail = -1;
        if(isBalanced(root)){
            return height(root);
        }
        return fail;
    }//method balanceHeight()
}
