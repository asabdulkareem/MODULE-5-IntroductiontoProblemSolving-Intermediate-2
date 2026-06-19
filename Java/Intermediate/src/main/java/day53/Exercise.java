package day53;

public class Exercise {
    public static class Node{
        public int data;
        public Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static String ex1PrintLinkedList(Node head){
        StringBuilder sb = new StringBuilder();
        while(head != null){
            sb.append(head.data + " ");
            head = head.next;
        }
        return sb.toString();
    }
    public static int ex2SearchInLinkedList(Node head, int value){
        while(head != null){
            if(head.data == value){
                return 1;
            }
            head = head.next;
        }
        return 0;
    }
    public static Node ex3InsertInLinkedList(Node head, int value, int index){
        Node node = new Node(value);
        if(head == null){
            return node;
        }
        if(index <= 0){
            node.next = head;
            return node;
        }
        Node cur = head;
        int i = 0;
        while (cur.next != null){
            if(i == index-1){
                node.next = cur.next;
                cur.next = node;
                break;
            }
            cur = cur.next;
            i++;
        }
        return head;
    }
    public static Node ex4DeleteInLinkedList(Node head, int index){
        if(head == null){
            return head;
        }
        if(index == 0){
            return head.next;
        }
        Node cur = head;
        int i = 0;
        while(cur.next != null){
            if(i == index-1){
                cur.next = cur.next.next;
                break;
            }
            cur = cur.next;
            i++;
        }
        return head;
    }
}
