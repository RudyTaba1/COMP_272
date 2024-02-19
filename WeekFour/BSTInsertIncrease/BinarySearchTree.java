package WeekFour.BSTInsertIncrease;

public class BinarySearchTree {

  static class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  Node root;

  public BinarySearchTree()   { root = null;}

  /**
   * Method insertAll
   * 
   * This methiod takes an array of integers and inserts them into 
   * the binary search tree. Duplicate values are allowed in this BST. 
   *
   * This method SHOULD utilize the 'insert' method below.
   */
  
  public void insertAll(int[] data) {
    
      // INSERT CODE HERE - THIS METHOD SHOULD USE THE 
      // INSERT METHOD BELOW.

      return;
  }


  /**
   * Method Insert
   *
   * This method inserts a new node into the binary search tree. The 
   * tree *DOES ALLOW* duplicates. Duplicates values are to the right. 
   * E.g., if inserting a value '6' and '6' already exists in the tree,
   * the newly inserted value '6' will be to the right child [subtree] 
   * of the existing node with value '6'.
   *
   * Use the helper private method provided below which is called by 
   * the public method.
   */
  
  public void insert(int data) {
    
      // INSERT CODE HERE 

      return;
  }


  
  /**
   * Method increaseAll
   *
   * This method inserts the value of ever node in the tree by  
   * a supplied value. 
   *
   * Use the helper private method provided below which is called by 
   * the public method.  
   */

  public void increaseAll(int value) {

    // INSERT CODE HERE
  
  
    return;
  }

  
  
  /**
   * Do NOT change below, the methid toString() is used by
   * in creating a string reprensentation of the tree. It can 
   * be used by System.out.println(tree) to print the tree, and
   * it is also used by the JUnit tests.
   */
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    toStringHelper(root, sb);
    if (sb.length() != 1) {
      sb.setLength(sb.length() - 2);
    }
    sb.append("]");
    return sb.toString();
  }

  private void toStringHelper(Node node, StringBuilder sb) {
    if (node == null) {
      return;
    }
    toStringHelper(node.left, sb);
    sb.append(node.data);
    sb.append(", ");
    toStringHelper(node.right, sb);
  }
}