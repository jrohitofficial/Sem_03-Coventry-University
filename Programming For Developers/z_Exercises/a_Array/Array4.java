package programmingForDevelopers.zExercises.aArray;

/*

    10.1-4
    Using Figure 10.3 as a model, illustrate the result of each operation in
    the sequence ENQUEUE(Q, 4), ENQUEUE(Q, 1), ENQUEUE(Q, 3),
    DEQUEUE(Q), ENQUEUE(Q, 8), and DEQUEUE(Q) on an initially
    empty queue Q stored in array Q[1 : 6].


        Index:  0 1 2 3 4 5
    Answer: Q: [0,0,0,0,0,0]

    ENQUEUE(Q, 4): [4,0,0,0,0,0]
                    head & tail at index 0.

    ENQUEUE(Q, 1): [4,1,0,0,0,0]
                    head at index 0 & tail at index 1.

    ENQUEUE(Q, 3): [4,1,3,0,0,0]
                    head at index 0 & tail at index 2.

    DEQUEUE(Q):    [4,1,3,0,0,0]
                    head at index 1 & tail at index 2 & return 4.

    ENQUEUE(Q, 8):  [4,1,3,8,0,0]
                    head at index 1 & tail at index 3.

    DEQUEUE(Q):     [4,1,3,8,0,0]
                     head at index 2 & tail at index 3 & return 1.



*/

public class Array4 {
}
