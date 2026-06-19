package day53;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionalTest {
    @Test void ex1KthElementInLinkedLlistReturnsMinusOneForNullHead() { assertEquals(-1, Additional.ex1KthElementInLinkedLlist(null, 2)); }
    @Test void ex1KthElementInLinkedLlistReturnsCorrectValueForValidIndex() { Additional.Node n1 = new Additional.Node(10); Additional.Node n2 = new Additional.Node(20); Additional.Node n3 = new Additional.Node(30); n1.next = n2; n2.next = n3; assertEquals(20, Additional.ex1KthElementInLinkedLlist(n1, 1)); }
    @Test void ex1KthElementInLinkedLlistReturnsMinusOneWhenIndexOutOfBounds() { Additional.Node n1 = new Additional.Node(5); Additional.Node n2 = new Additional.Node(6); n1.next = n2; assertEquals(-1, Additional.ex1KthElementInLinkedLlist(n1, 5)); }
    @Test void ex2CheckSortedLinkedListReturnsOneForSortedList() { Additional.Node n1 = new Additional.Node(1); Additional.Node n2 = new Additional.Node(2); Additional.Node n3 = new Additional.Node(3); n1.next = n2; n2.next = n3; assertEquals(1, Additional.ex2CheckSortedLinkedList(n1)); }
    @Test void ex2CheckSortedLinkedListReturnsZeroForUnsortedList() { Additional.Node n1 = new Additional.Node(3); Additional.Node n2 = new Additional.Node(2); n1.next = n2; assertEquals(0, Additional.ex2CheckSortedLinkedList(n1)); }
    @Test void ex2CheckSortedLinkedListReturnsZeroForNullHead() { assertEquals(0, Additional.ex2CheckSortedLinkedList(null)); }
    @Test void ex2CheckSortedLinkedListReturnsOneForSingleElementList() { Additional.Node only = new Additional.Node(42); assertEquals(1, Additional.ex2CheckSortedLinkedList(only)); }
    @Test void ex3CompareLinkedListReturnsTrueWhenBothNull() { assertEquals(true, Additional.ex3CompareLinkedList(null, null)); }
    @Test void ex3CompareLinkedListReturnsTrueWhenElementsAreLessOrEqualAndSameLength() { Additional.Node a1 = new Additional.Node(1); Additional.Node a2 = new Additional.Node(2); a1.next = a2; Additional.Node b1 = new Additional.Node(1); Additional.Node b2 = new Additional.Node(3); b1.next = b2; assertEquals(true, Additional.ex3CompareLinkedList(a1, b1)); }
    @Test void ex3CompareLinkedListReturnsFalseWhenFirstHasGreaterElement() { Additional.Node a1 = new Additional.Node(2); Additional.Node a2 = new Additional.Node(5); a1.next = a2; Additional.Node b1 = new Additional.Node(1); Additional.Node b2 = new Additional.Node(6); b1.next = b2; assertEquals(false, Additional.ex3CompareLinkedList(a1, b1)); }
    @Test void ex3CompareLinkedListReturnsFalseForDifferentLengths() { Additional.Node a1 = new Additional.Node(1); Additional.Node a2 = new Additional.Node(2); Additional.Node a3 = new Additional.Node(3); a1.next = a2; a2.next = a3; Additional.Node b1 = new Additional.Node(1); b1.next = null; assertEquals(false, Additional.ex3CompareLinkedList(a1, b1)); }
}
