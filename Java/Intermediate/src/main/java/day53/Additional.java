package day53;

import org.w3c.dom.Node;

public class Additional {
    public static class Node{
        public int data;
        public Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static int ex1KthElementInLinkedLlist(Node head, int k){
        if(head == null){
            return -1;
        }
        int count = 0;
        while(head != null){
            if(count == k){
                return head.data;
            }
            head = head.next;
            count++;
        }
        return -1;
    }
    public static int ex2CheckSortedLinkedList(Node head){
        if(head == null){
            return 0;
        }
        while (head.next != null){
            if(head.data > head.next.data){
                return 0;
            }
            head = head.next;
        }
        return 1;
    }
    public static boolean ex3CompareLinkedList(Node head1, Node head2){
        if(head1 == null && head2 == null){
            return true;
        }
        while(head1 != null && head2 != null){
            if(head1.data > head2.data){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1 == null && head2 == null;
    }
}
