package programmingForDevelopers.oday20Graph.adjacencyList;


import java.util.Arrays;
import java.util.Iterator;

public class AdjacencyList {

    LinkedListExample1[] a;
    int vertices;

    AdjacencyList(int vertices) {
        this.vertices = vertices;
        a = new LinkedListExample1[vertices];
        for (int i = 0; i < vertices; i++) {
            a[i] = new LinkedListExample1();
        }
    }

    public void addEdge(int source, int destination) {
        a[source].addNode(destination);
        //a[destination].addNode(source); Commented for Topological sort (Directed graph)
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " is connected to: ");
            a[i].getList();
            System.out.println();
        }
    }

    public int[] getAdjacentNode(int i) {
        int list[] = new int[a[i].getSize()];
        LinkedListExample1.Node current = a[i].head;
        int indx = 0;
        while (current != null) {
            list[indx++] = current.data;
            current = current.next;
        }
        return list;
    }


    public void BFS(int rootnode) {
        System.out.println("Exploring element with BFS algorithm with rootNode : " + rootnode);
        boolean visited[] = new boolean[vertices];
        QueueEg q = new QueueEg(vertices);
        visited[rootnode] = true;
        q.enqueue(rootnode);
        while (!q.isEmpty()) {
            int x = q.dequeue();
            int[] list = getAdjacentNode(x);
            for (int i = 0; i < list.length; i++) {
                int adjNode = list[i];
                if (!visited[adjNode]) {
                    q.enqueue(adjNode);
                    visited[adjNode] = true;
                }
            }
            System.out.println("Element visited : " + x);
        }
    }

    public void topoSort() {

        System.out.println("Topological sort started.");

        int indegree[] = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            //i=1 list[1,2] list[j]=list[0]=1=adjaval
            int[] list = getAdjacentNode(i);
            for (int j = 0; j < list.length; j++) {
                int adjval = list[j];
                indegree[adjval]++;
            }
        }

        QueueEg q = new QueueEg(vertices);
        for (int i = 0; i < vertices; i++) {
            if (indegree[i] == 0) {
                q.enqueue(i);
            }
        }

        int cnt = 0;
        while (!q.isEmpty()) {
            cnt++;
            int x = q.dequeue();
            System.out.println("Visited Node : " + x);
            int[] list = getAdjacentNode(x);
            for (int i = 0; i < list.length; i++) {
                int adjval = list[i];
                indegree[adjval]--;
                if (indegree[adjval] == 0) {
                    q.enqueue(adjval);
                }
            }
        }
        if (cnt != vertices) {
            System.out.println("A cycle exists.");
        }
    }

    public void DFS(int rootnode, boolean[] visited) {

        visited[rootnode] = true;
        System.out.println("Node visited: " + rootnode);
//        Iterator<Integer> iterator= Arrays.stream(getAdjacentNode(rootnode)).iterator();
//        while(iterator.hasNext()){
//            int adjval=iterator.next();
//        }
        int[] list = getAdjacentNode(rootnode);
        for (int i = 0; i < list.length; i++) {
            int adjval = list[i];
            if (!visited[adjval]) {
                DFS(adjval, visited);
            }
        }
    }


    public void depthfirstsearch(int rootnode) {
        System.out.println("Traversing in  DFS manner");
        boolean visited[] = new boolean[vertices];
        DFS(rootnode, visited);
    }

    public void DFSTopo(int rootnode, boolean[] visited, StackExample stk) {

        visited[rootnode] = true;
        int[] list = getAdjacentNode(rootnode);
        for (int i = 0; i < list.length; i++) {
            int adjval = list[i];
            if (!visited[adjval]) {
                DFSTopo(adjval, visited, stk);
            }
        }
        stk.push(rootnode);
    }


    public void topoSortDFS() {
        boolean visited[] = new boolean[vertices];
        StackExample stk = new StackExample(vertices);

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                DFSTopo(i, visited, stk);
            }
        }
        System.out.println();
        System.out.print("Topological sort using DFS: ");
        while (!stk.isEmpty()) {
            System.out.print(stk.pop() + " , ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        AdjacencyList g = new AdjacencyList(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        System.out.println("Grapth printed: ");
        g.printGraph();
        System.out.println();

        /*
        System.out.println();
        System.out.print("Adjacent Nodes: ");
        int[] res = g.getAdjacentNode(2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " , ");
        }

        System.out.println("\n");
        g.BFS(2);

        System.out.println();
        g.depthfirstsearch(2);
        System.out.println();


        g.topoSort();

         */

        g.topoSortDFS();
    }
}
