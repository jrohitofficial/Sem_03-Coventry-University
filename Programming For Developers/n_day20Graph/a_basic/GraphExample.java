package programmingForDevelopers.oday20Graph.basic;

public class GraphExample {
    int vertices;
    int[][] matrix;

    GraphExample(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    public void addEdge(int source, int destination,int weight) {
        matrix[source][destination] = weight;
        matrix[destination][source] = weight;
    }

    public void printGraph() {
        //travelling to rows
        for (int i = 0; i < vertices; i++) {
            //travelling to columns
            for (int j = 0; j < vertices; j++) {
                //printing values of matrix
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public int getAdjVerticesSize(int val) {
        int count = 0;
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                if (i == val && matrix[i][j] != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public void printAdjEdges() {
        //travelling to rows
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " is connected to: ");
            for (int j = 0; j < vertices; j++) {
                if (matrix[i][j] != 0) {
                    System.out.print(j + ", ");
                }
            }
            System.out.println("");
        }
    }



    public int[] getAdjNode(int i) {
        //travelling to rows
        int pos = 0;
        int[] adjNode = new int[getAdjVerticesSize(i)];

        for (int j = 0; j < vertices; j++) {
            if (matrix[i][j] != 0) {
                adjNode[pos] = j;
                pos++;
            }
        }

        return adjNode;
    }

    public Node getAdjLinkedList(int i) {
        for (int j = 0; j < vertices; j++) {
            if (matrix[i][j] != 0) {
                addNode(j);
            }
        }
        return head;
    }


    public static class Node {
        int data;
        GraphExample.Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    GraphExample.Node head = null;
    GraphExample.Node tail = null;

    public void addNode(int data) {
        GraphExample.Node newnode = new GraphExample.Node(data);
        if (head == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }


    public static void main(String[] args) {
        GraphExample g = new GraphExample(6);
        g.addEdge(0, 1,10);
        g.addEdge(0, 2,5);
        g.addEdge(0, 5,100);
        g.addEdge(1, 3,20);
        g.addEdge(1, 2,30);
        g.addEdge(2, 4,10);
        g.addEdge(3, 4,5);
        g.addEdge(3, 5,15);
        g.addEdge(4, 5,15);

        System.out.println(" ");
        g.printGraph();

        System.out.println();
        g.printAdjEdges();

        System.out.println();
        int[] res = g.getAdjNode(2);
        System.out.println("Adjacent node in array");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

        System.out.println("\n");
        System.out.println("Adjacent node in linked list");
        Node res1 = g.getAdjLinkedList(2);
        while (res1 != null) {
            System.out.print(res1.data + " ");
            res1 = res1.next;
        }
    }

}
