using System;
using System.Collections.Generic;
using System.Text;
using static Intermediate.day53.Exercise;

namespace Intermediate.day53
{
    public class Exercise
    {
        public class Node
        {
            public int Value { get; set; }
            public Node Next { get; set; }
            public Node(int value)
            {
                Value = value;
                Next = null;
            }
        }
        public static string ex1PrintLinkedList(Node node)
        {
            StringBuilder sb = new StringBuilder();
            while (node != null)
            {
                sb.Append(node.Value);
                node = node.Next;
            }
            return sb.ToString();
        }
        public static Boolean ex2SearchInLinkedList(Node head, int vale)
        {
            while (head != null)
            {
                if (head.Value == vale)
                {
                    return true;
                }
                head = head.Next;
            }
            return false;
        }
        public static Node ex3InsertInLinkedList(Node head, int value, int index)
        {
            Node node = new Node(value);
            if (head == null)
            {
                return node;
            }
            if(index <= 0)
            {
                node.Next = head;
                return node;
            }
            int i = 0;
            Node current = head;
            while(current != null)
            {
                if(index-1 == i)
                {
                    node.Next = current.Next;
                    current.Next = node;
                    return head;
                }
                current = current.Next;
                i++;
            }
            return head;
        }
        public static Node ex4DeleteInLinkedList(Node head, int index)
        {
            if(head == null)
            {
                return null;
            }
            if (index <= 0)
                return head.Next;
            Node current = head;
            int i = 0;
            while (current != null)
            {
                if (index - 1 == i)
                {
                    current.Next = current.Next.Next;
                    return head;
                }
                current = current.Next;
                i++;
            }
            return head;
        }
    }
}
