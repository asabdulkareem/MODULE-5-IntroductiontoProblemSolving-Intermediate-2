using System;
using Xunit;
using Intermediate.day54;

namespace TestIntermediate.day54
{
    public class TestExercise
    {
        private Exercise.TreeNode BuildSampleTree()
        {
            // Construct:
            //       1
            //      / \
            //     2   3
            //    / \
            //   4   5
            return new Exercise.TreeNode
            {
                Data = 1,
                Left = new Exercise.TreeNode
                {
                    Data = 2,
                    Left = new Exercise.TreeNode { Data = 4 },
                    Right = new Exercise.TreeNode { Data = 5 }
                },
                Right = new Exercise.TreeNode { Data = 3 }
            };
        }

        [Fact]
        public void Ex1InorderTraversal_BasicNullAndSingle()
        {
            var root = BuildSampleTree();
            Assert.Equal(new int[] { 4, 2, 5, 1, 3 }, Exercise.ex1InorderTraversal(root));

            Assert.Empty(Exercise.ex1InorderTraversal(null));

            var single = new Exercise.TreeNode { Data = 7 };
            Assert.Equal(new int[] { 7 }, Exercise.ex1InorderTraversal(single));
        }

        [Fact]
        public void Ex2PreorderTraversal_BasicNullAndSingle()
        {
            var root = BuildSampleTree();
            Assert.Equal(new int[] { 1, 2, 4, 5, 3 }, Exercise.ex2PreorderTraversal(root));

            Assert.Empty(Exercise.ex2PreorderTraversal(null));

            var single = new Exercise.TreeNode { Data = 9 };
            Assert.Equal(new int[] { 9 }, Exercise.ex2PreorderTraversal(single));
        }

        [Fact]
        public void Ex3PostorderTraversal_BasicNullAndSingle()
        {
            var root = BuildSampleTree();
            Assert.Equal(new int[] { 4, 5, 2, 3, 1 }, Exercise.ex3PostorderTraversal(root));

            Assert.Empty(Exercise.ex3PostorderTraversal(null));

            var single = new Exercise.TreeNode { Data = 11 };
            Assert.Equal(new int[] { 11 }, Exercise.ex3PostorderTraversal(single));
        }

        [Fact]
        public void Ex4TreeHeight_NullSingleAndSample()
        {
            Assert.Equal(0, Exercise.ex4TreeHeight(null));

            var single = new Exercise.TreeNode { Data = 42 };
            Assert.Equal(1, Exercise.ex4TreeHeight(single));

            var root = BuildSampleTree();
            Assert.Equal(3, Exercise.ex4TreeHeight(root));
        }

        [Fact]
        public void Ex5NodesCount_NullSingleAndSample()
        {
            Assert.Equal(0, Exercise.ex5NodesCount(null));

            var single = new Exercise.TreeNode { Data = -1 };
            Assert.Equal(1, Exercise.ex5NodesCount(single));

            var root = BuildSampleTree();
            Assert.Equal(5, Exercise.ex5NodesCount(root));
        }
    }
}