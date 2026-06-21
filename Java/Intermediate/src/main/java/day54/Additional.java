package day54;

import javax.swing.tree.TreeNode;

public class Additional {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    public static int ex1CountingTheNodes(TreeNode root){
        if(root == null) return 0;
        return 1 + ex1CountingTheNodes(root.left) + ex1CountingTheNodes(root.right);
    }
    public static int ex1CountingTheNodes(TreeNode root, int maxValue){
        if(root == null) return 0;
        int count = 0;
        if(root.val > maxValue){
            count++;
            maxValue = root.val;
        }
        count += ex1CountingTheNodes(root.left,maxValue);
        count += ex1CountingTheNodes(root.right,maxValue);
        return count;
    }
    public static int ex2SumOfLeftLeaves(TreeNode root){
        if(root == null) return 0;
        int sum = 0;
        if(root.left != null && root.left.left == null && root.left.right == null){
            sum +=  root.left.val;
        }
        else{
            sum += ex2SumOfLeftLeaves(root.left);
        }
        if(root.right != null){
            sum += ex2SumOfLeftLeaves(root.right);
        }
        return sum;
    }
}
