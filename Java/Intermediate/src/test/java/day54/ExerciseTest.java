package day54;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExerciseTest {
	@Test void exInorderTraversalReturnsElementsInInorderForSimpleTree() { Exercise ex = new Exercise(); Exercise.TreeNode n1 = ex.new TreeNode(); Exercise.TreeNode n2 = ex.new TreeNode(); Exercise.TreeNode n3 = ex.new TreeNode(); n1.val = 1; n2.val = 2; n3.val = 3; n1.left = n2; n1.right = n3; assertArrayEquals(new int[]{2,1,3}, Exercise.exInorderTraversal(n1)); }
	@Test void ex2PreorderTraversalReturnsElementsInPreorderForSimpleTree() { Exercise ex = new Exercise(); Exercise.TreeNode n1 = ex.new TreeNode(); Exercise.TreeNode n2 = ex.new TreeNode(); Exercise.TreeNode n3 = ex.new TreeNode(); n1.val = 1; n2.val = 2; n3.val = 3; n1.left = n2; n1.right = n3; assertArrayEquals(new int[]{1,2,3}, Exercise.ex2PreorderTraversal(n1)); }
	@Test void ex3PostorderTraversalReturnsElementsInPostorderForSimpleTree() { Exercise ex = new Exercise(); Exercise.TreeNode n1 = ex.new TreeNode(); Exercise.TreeNode n2 = ex.new TreeNode(); Exercise.TreeNode n3 = ex.new TreeNode(); n1.val = 1; n2.val = 2; n3.val = 3; n1.left = n2; n1.right = n3; assertArrayEquals(new int[]{2,3,1}, Exercise.ex3PostorderTraversal(n1)); }
	@Test void exInorderTraversalSingleNodeReturnsSingleElement() { Exercise ex = new Exercise(); Exercise.TreeNode n = ex.new TreeNode(); n.val = 7; assertArrayEquals(new int[]{7}, Exercise.exInorderTraversal(n)); }
	@Test void ex2PreorderTraversalSingleNodeReturnsSingleElement() { Exercise ex = new Exercise(); Exercise.TreeNode n = ex.new TreeNode(); n.val = 7; assertArrayEquals(new int[]{7}, Exercise.ex2PreorderTraversal(n)); }
	@Test void ex3PostorderTraversalSingleNodeReturnsSingleElement() { Exercise ex = new Exercise(); Exercise.TreeNode n = ex.new TreeNode(); n.val = 7; assertArrayEquals(new int[]{7}, Exercise.ex3PostorderTraversal(n)); }
	@Test void ex4TreeHeightReturnsZeroForNullRoot() { assertEquals(0, Exercise.ex4TreeHeight(null)); }
	@Test void ex4TreeHeightComputesCorrectHeightForSkewedLeftTree() { Exercise ex = new Exercise(); Exercise.TreeNode n1 = ex.new TreeNode(); Exercise.TreeNode n2 = ex.new TreeNode(); Exercise.TreeNode n3 = ex.new TreeNode(); n1.val = 1; n2.val = 2; n3.val = 3; n1.left = n2; n2.left = n3; assertEquals(3, Exercise.ex4TreeHeight(n1)); }
	@Test void ex5NodesCountReturnsZeroForNullRoot() { assertEquals(0, Exercise.ex5NodesCount(null)); }
	@Test void ex5NodesCountCountsAllNodesInTree() { Exercise ex = new Exercise(); Exercise.TreeNode n1 = ex.new TreeNode(); Exercise.TreeNode n2 = ex.new TreeNode(); Exercise.TreeNode n3 = ex.new TreeNode(); n1.val = 1; n2.val = 2; n3.val = 3; n1.left = n2; n1.right = n3; assertEquals(3, Exercise.ex5NodesCount(n1)); }
}
