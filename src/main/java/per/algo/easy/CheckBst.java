package per.algo.easy;

public class CheckBst {

    class Node {
        int val;
        Node left;
        Node right;
    }
//2 solution can be found on O(n)
    //1. range based minus infy and positive infy, or inorder traversal expect sorted output
    //This solution is based on range
    boolean checkBST(Node root) {
        return checkBST(root, null,null);
     }

     boolean checkBST(Node root, Integer min ,Integer max )
    {
        if(root==null)
            return true;

        if( min<root.val || root.val <max)
        {
            return false;
        }
        return checkBST(root.left,min,root.val) && checkBST(root.right,root.val,max);
    }
    public static void main(String[] args) {

    }
}
