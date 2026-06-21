package day54;


public class Exercise {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    public static int[] exInorderTraversal(TreeNode root){
        if(root == null) return new int[0];
        int[] left = exInorderTraversal(root.left);
        int[] right = exInorderTraversal(root.right);
        int[] res = new int[left.length + 1 + right.length];
        int position = 0;
        for(int j = 0; j < left.length; j++){
            res[position] = left[j];
            position++;
        }
        res[position] = root.val;
        position++;
        for(int j = 0; j < right.length; j++){
            res[position] = right[j];
            position++;
        }
        return res;
    }
    public static int[] ex2PreorderTraversal(TreeNode root){
        if(root == null) return new int[0];
        int[] left = ex2PreorderTraversal(root.left);
        int[] right = ex2PreorderTraversal(root.right);
        int[] res = new int[left.length + 1 + right.length];
        res[0] = root.val;
        int position  = 1;
        for(int j = 0; j < left.length; j++){
            res[position] = left[j];
            position++;
        }
        for(int j = 0; j < right.length; j++){
            res[position] = right[j];
            position++;
        }
        return res;
    }
    public static int[] ex3PostorderTraversal(TreeNode root){
        if(root == null) return new int[0];
        int[] left = ex3PostorderTraversal(root.left);
        int[] right = ex3PostorderTraversal(root.right);
        int[] res = new int[left.length + 1 + right.length];
        int position = 0;
        for(int j = 0; j < left.length; j++){
            res[position] = left[j];
            position++;
        }
        for(int j = 0; j < right.length; j++){
            res[position] = right[j];
            position++;
        }
        res[position] = root.val;
        return res;
    }
    public static int ex4TreeHeight(TreeNode root){
        if(root == null) return 0;
        int leftHeight = ex4TreeHeight(root.left);
        int rightHeight = ex4TreeHeight(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
    public static int ex5NodesCount(TreeNode root){
        if(root == null) return 0;
        return ex5NodesCount(root.left) + ex5NodesCount(root.right) + 1;
    }
}
