class Exercise:
    class Node:
        def __init__(self, data):
            self.data = data
            self.next = None

        def ex1PrintLinkedList(self, head):
            sb = ""
            while self.head != None:
                sb = sb + "->" + head.data
                head = head.next
            return sb

        def ex2SearchInLinkedList(self, head, target):
            while head != None:
                if head.data == target:
                    return True
                head = head.next
            return False

        def ex3InsertInLinkedList(self, head, data, index):
            new_node = self.Node(data)
            if head == None:
                return new_node
            if index == 0:
                new_node.next = head
                return new_node
            current = head
            i=0
            while current.next != None:
                if i==index:
                    new_node.next = current.next
                    current.next = new_node
                    return head
            return head

        def ex4DeleteInLinkedList(self, head, index):
            if head == None:
                return None
            if index == 0:
                return head.next
            current = head
            i=0
            while current.next != None:
                if i==index-1:
                    current.next = current.next.next
                    return head
                current = current.next
                i+=1
            return head