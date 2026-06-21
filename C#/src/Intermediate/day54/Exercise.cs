using System;
using System.Collections.Generic;
using System.Text;

namespace Intermediate.day54
{
    public class Exercise
    {
        public class TreeNode
        {
            public int Data { get; set; }
            public TreeNode Left { get; set; }
            public TreeNode Right { get; set; }
        }
        public static int[] ex1InorderTraversal(TreeNode root)
        {
            if (root == null) return new int[0];
            int[] left = ex1InorderTraversal(root.Left);
            int[] right = ex1InorderTraversal(root.Right);
            int[] res = new int[left.Length + 1 + right.Length];
            int position = 0;
            for (int i = 0; i < left.Length; i++)
            {
                res[position++] = left[i];
            }
            res[position++] = root.Data;
            for (int i = 0; i < right.Length; i++)
            {
                res[position++] = right[i];
            }
            return res;
        }
        public static int[] ex2PreorderTraversal(TreeNode root)
        {
            if (root == null) return new int[0];
            int[] left = ex2PreorderTraversal(root.Left);
            int[] right = ex2PreorderTraversal(root.Right);
            int[] res = new int[left.Length + 1 + right.Length];
            int position = 0;
            res[position++] = root.Data;
            for (int i = 0; i < left.Length; i++)
            {
                res[position++] = left[i];
            }
            for (int i = 0; i < right.Length; i++)
            {
                res[position++] = right[i];
            }
            return res;
        }
        public static int[] ex3PostorderTraversal(TreeNode tree)
        {
            if (tree == null) return new int[0];
            int[] left = ex3PostorderTraversal(tree.Left);
            int[] right = ex3PostorderTraversal(tree.Right);
            int[] res = new int[left.Length + 1 + right.Length];
            int position = 0;
            for (int i = 0;i < left.Length; i++)
            {
                res[position++] = left[i];
            }
            for (int i = 0; i < right.Length; i++)
            {
                res[position++] = right[i];
            }
            res[position++] = tree.Data;
            return res;
        }
        public static int ex4TreeHeight(TreeNode root)
        {
            if(root == null) return 0;
            int left = ex4TreeHeight(root.Left);
            int right = ex4TreeHeight(root.Right);
            return 1 + Math.Max(left, right);
        }
        public static int ex5NodesCount(TreeNode root)
        {
            if (root == null) return 0;
            return 1 + ex5NodesCount(root.Left) + ex5NodesCount(root.Right);
        }
    }
}
