package day54;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdditionalTest {

    @Test
    void ex1CountingTheNodesReturnsZeroForNullRoot() {
        assertEquals(0, Additional.ex1CountingTheNodes((Additional.TreeNode) null));
    }

    @Test
    void ex1CountingTheNodesCountsAllNodesInNonTrivialTree() {
        Additional outer = new Additional();
        Additional.TreeNode root = outer.new TreeNode();
        root.val = 3;
        root.left = outer.new TreeNode();
        root.left.val = 1;
        root.right = outer.new TreeNode();
        root.right.val = 4;
        root.right.right = outer.new TreeNode();
        root.right.right.val = 5;

        // tree has 4 nodes
        assertEquals(4, Additional.ex1CountingTheNodes(root));
    }

    @Test
    void ex1CountingTheNodesWithMaxValueCountsRecordNodesAlongPaths() {
        Additional outer = new Additional();
        Additional.TreeNode root = outer.new TreeNode();
        root.val = 3;
        root.left = outer.new TreeNode();
        root.left.val = 1;
        root.right = outer.new TreeNode();
        root.right.val = 4;
        root.right.right = outer.new TreeNode();
        root.right.right.val = 5;

        // starting with maxValue 0: nodes that are greater than all previous on their root-to-node path are 3,4,5 -> total 3
        assertEquals(3, Additional.ex1CountingTheNodes(root, 0));

        // starting with maxValue higher than any node -> 0
        assertEquals(0, Additional.ex1CountingTheNodes(root, 10));

        // single node compared to smaller maxValue
        Additional.TreeNode single = outer.new TreeNode();
        single.val = 5;
        assertEquals(1, Additional.ex1CountingTheNodes(single, 3));
    }

    @Test
    void ex2SumOfLeftLeavesHandlesNullAndSingleNode() {
        assertEquals(0, Additional.ex2SumOfLeftLeaves(null));
        Additional outer = new Additional();
        Additional.TreeNode single = outer.new TreeNode();
        single.val = 1;
        assertEquals(0, Additional.ex2SumOfLeftLeaves(single));
    }

    @Test
    void ex2SumOfLeftLeavesSumsAllLeftLeafValuesInTree() {
        Additional outer = new Additional();
        Additional.TreeNode root = outer.new TreeNode();
        root.val = 1;

        // left subtree: 2 -> left 4 (left leaf)
        root.left = outer.new TreeNode();
        root.left.val = 2;
        root.left.left = outer.new TreeNode();
        root.left.left.val = 4;

        // right subtree: 3 -> left 5 (left leaf), right 6
        root.right = outer.new TreeNode();
        root.right.val = 3;
        root.right.left = outer.new TreeNode();
        root.right.left.val = 5;
        root.right.right = outer.new TreeNode();
        root.right.right.val = 6;

        // left leaves are 4 and 5 => sum 9
        assertEquals(9, Additional.ex2SumOfLeftLeaves(root));
    }
}

