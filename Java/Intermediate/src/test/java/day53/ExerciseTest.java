package day53;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseTest {
    @Test void ex1PrintLinkedListPrintsAllNodesSeparatedBySpace() { Exercise.Node n1 = new Exercise.Node(1); Exercise.Node n2 = new Exercise.Node(2); Exercise.Node n3 = new Exercise.Node(3); n1.next = n2; n2.next = n3; assertEquals("1 2 3 ", Exercise.ex1PrintLinkedList(n1)); }
    @Test void ex1PrintLinkedListReturnsEmptyStringForNullHead() { assertEquals("", Exercise.ex1PrintLinkedList(null)); }
    @Test void ex2SearchInLinkedListReturns1WhenValuePresent() { Exercise.Node n1 = new Exercise.Node(1); Exercise.Node n2 = new Exercise.Node(2); Exercise.Node n3 = new Exercise.Node(3); n1.next = n2; n2.next = n3; assertEquals(1, Exercise.ex2SearchInLinkedList(n1, 2)); }
    @Test void ex2SearchInLinkedListReturns0WhenValueAbsent() { Exercise.Node n1 = new Exercise.Node(1); Exercise.Node n2 = new Exercise.Node(2); n1.next = n2; assertEquals(0, Exercise.ex2SearchInLinkedList(n1, 5)); }
    @Test void ex3InsertInLinkedListInsertsAtHeadWhenIndexIsNonPositive() { Exercise.Node n1 = new Exercise.Node(1); Exercise.Node n2 = new Exercise.Node(2); n1.next = n2; Exercise.Node newHead = Exercise.ex3InsertInLinkedList(n1, 0, -1); assertEquals("0 1 2 ", Exercise.ex1PrintLinkedList(newHead)); }
    @Test void ex3InsertInLinkedListInsertsAtGivenIndex() { Exercise.Node n1 = new Exercise.Node(1); Exercise.Node n2 = new Exercise.Node(2); Exercise.Node n3 = new Exercise.Node(3); n1.next = n2; n2.next = n3; Exercise.Node head = Exercise.ex3InsertInLinkedList(n1, 9, 1); assertEquals("1 9 2 3 ", Exercise.ex1PrintLinkedList(head)); }
    @Test void ex3InsertInLinkedListInsertsIntoEmptyList() { Exercise.Node head = Exercise.ex3InsertInLinkedList(null, 5, 3); assertEquals("5 ", Exercise.ex1PrintLinkedList(head)); }
    @Test void ex3InsertInLinkedListLeavesListUnchangedWhenIndexOutOfBounds() { Exercise.Node n1 = new Exercise.Node(1); Exercise.Node n2 = new Exercise.Node(2); n1.next = n2; Exercise.Node head = Exercise.ex3InsertInLinkedList(n1, 9, 10); assertEquals("1 2 ", Exercise.ex1PrintLinkedList(head)); }
    @Test void ex4DeleteInLinkedListDeletesHeadWhenIndexZero() { Exercise.Node n1 = new Exercise.Node(1); Exercise.Node n2 = new Exercise.Node(2); Exercise.Node n3 = new Exercise.Node(3); n1.next = n2; n2.next = n3; Exercise.Node head = Exercise.ex4DeleteInLinkedList(n1, 0); assertEquals("2 3 ", Exercise.ex1PrintLinkedList(head)); }
    @Test void ex4DeleteInLinkedListDeletesNodeAtIndex() { Exercise.Node n1 = new Exercise.Node(1); Exercise.Node n2 = new Exercise.Node(2); Exercise.Node n3 = new Exercise.Node(3); Exercise.Node n4 = new Exercise.Node(4); n1.next = n2; n2.next = n3; n3.next = n4; Exercise.Node head = Exercise.ex4DeleteInLinkedList(n1, 2); assertEquals("1 2 4 ", Exercise.ex1PrintLinkedList(head)); }
    @Test void ex4DeleteInLinkedListReturnsNullWhenDeletingOnlyElementAtZero() { Exercise.Node only = new Exercise.Node(7); Exercise.Node head = Exercise.ex4DeleteInLinkedList(only, 0); assertEquals("", Exercise.ex1PrintLinkedList(head)); }
    @Test void ex4DeleteInLinkedListLeavesListUnchangedWhenIndexOutOfBounds() { Exercise.Node n1 = new Exercise.Node(1); Exercise.Node n2 = new Exercise.Node(2); n1.next = n2; Exercise.Node head = Exercise.ex4DeleteInLinkedList(n1, 5); assertEquals("1 2 ", Exercise.ex1PrintLinkedList(head)); }
}
