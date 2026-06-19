using System;
using Xunit;
using Intermediate.day53;

namespace TestIntermediate.day53
{
    public class TestExercise
    {
        private Exercise.Node BuildList(params int[] values)
        {
            if (values == null || values.Length == 0) return null;
            var head = new Exercise.Node(values[0]);
            var current = head;
            for (int i = 1; i < values.Length; i++)
            {
                current.Next = new Exercise.Node(values[i]);
                current = current.Next;
            }
            return head;
        }

        [Fact]
        public void Ex1PrintLinkedList_NullAndSequences()
        {
            Assert.Equal(string.Empty, Exercise.ex1PrintLinkedList(null));

            var single = BuildList(5);
            Assert.Equal("5", Exercise.ex1PrintLinkedList(single));

            var multi = BuildList(1, 2, 3);
            Assert.Equal("123", Exercise.ex1PrintLinkedList(multi));
        }

        [Fact]
        public void Ex2SearchInLinkedList_FoundAndNotFound()
        {
            var list = BuildList(4, 7, 9);
            Assert.True(Exercise.ex2SearchInLinkedList(list, 7));
            Assert.False(Exercise.ex2SearchInLinkedList(list, 5));
            Assert.False(Exercise.ex2SearchInLinkedList(null, 1));
        }

        [Fact]
        public void Ex3InsertInLinkedList_InsertIntoNullAndHeadAndMiddleAndOutOfBounds()
        {
            // Insert into null list
            var newHead = Exercise.ex3InsertInLinkedList(null, 10, 0);
            Assert.Equal("10", Exercise.ex1PrintLinkedList(newHead));

            // Insert at head (index <= 0)
            var list = BuildList(1, 2);
            var headInserted = Exercise.ex3InsertInLinkedList(list, 0, 0);
            Assert.Equal("012", Exercise.ex1PrintLinkedList(headInserted));

            // Insert in middle (index = 1 -> after first node)
            var list2 = BuildList(1, 2, 3);
            var inserted = Exercise.ex3InsertInLinkedList(list2, 5, 1);
            Assert.Equal("1523", Exercise.ex1PrintLinkedList(inserted));

            // Insert with index greater than length -> unchanged
            var list3 = BuildList(1, 2, 3);
            var unchanged = Exercise.ex3InsertInLinkedList(list3, 8, 10);
            Assert.Equal("123", Exercise.ex1PrintLinkedList(unchanged));
        }

        [Fact]
        public void Ex4DeleteInLinkedList_DeleteFromNullHeadAndHeadAndMiddleAndOutOfBounds()
        {
            // Delete from null -> null
            Assert.Null(Exercise.ex4DeleteInLinkedList(null, 1));

            // Delete head when index <= 0
            var list = BuildList(1, 2, 3);
            var afterHeadDelete = Exercise.ex4DeleteInLinkedList(list, 0);
            Assert.Equal("23", Exercise.ex1PrintLinkedList(afterHeadDelete));

            // Delete middle (index 1)
            var list2 = BuildList(1, 2, 3);
            var afterMiddleDelete = Exercise.ex4DeleteInLinkedList(list2, 1);
            Assert.Equal("13", Exercise.ex1PrintLinkedList(afterMiddleDelete));

            // Delete out of bounds -> unchanged
            var list3 = BuildList(1, 2, 3);
            var unchanged = Exercise.ex4DeleteInLinkedList(list3, 10);
            Assert.Equal("123", Exercise.ex1PrintLinkedList(unchanged));
        }
    }
}