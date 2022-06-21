package programmingForDevelopers.zExercises.bLinkedList;

/*

Exercises
10.2-1
Explain why the dynamic-set operation INSERT on a singly linked list
can be implemented in O(1) time, but the worst-case time for DELETE
is Θ(n).

Short Answer: In INSERT operation, we directly add a node in the tail.
              Worst-case time for DELETE is Θ(n) when we have to iterate to the tail from the head to delete the tail.

Answer:
        INSERT operation on a singly linked list can be implemented in O(1) time because
        we add a link on either just the head or just the tail which does not require traversing in any form.

        However, the worst-case time for DELETE is Θ(n) because
        in the worst case (i.e. the last linked list is to be deleted),
        we need to traverse to the last linked list requiring ' n ' (size of linked lists) iteration
        to reach the last linked list.

*/


public class LinkedList1 {
}
