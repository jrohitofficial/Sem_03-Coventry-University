package programmingForDevelopers.oday20Graph.DFSExample;



public class DFS {


    LinkedListExample1[] a;
    int vertices;

    DFS(int vertices) {
        this.vertices = vertices;
        a = new LinkedListExample1[vertices];
        for (int i = 0; i < vertices; i++) {
            a[i] = new LinkedListExample1();
        }
    }

    public void addEdge(int source, int destination) {
        a[source].addNode(destination);
        a[destination].addNode(source);
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " is connected to: ");
            a[i].getList();
            System.out.println();
        }
    }

    public int [] getAdjacentNode(int i){
        int list[]=new int[a[i].getSize()];
        LinkedListExample1.Node current=a[i].head;
        int indx=0;
        while(current!=null){
            list[indx++]= current.data;
            current=current.next;
        }
        return list;
    }



    public void DFSearch(int rootnode, boolean[] visited) {

        visited[rootnode] = true;
        System.out.println("Node visited: " + rootnode);

        int[] list = getAdjacentNode(rootnode);
        for (int i = 0; i < list.length; i++) {
            int adjval = list[i];
            if (!visited[adjval]) {
                DFSearch(adjval, visited);
            }
        }
    }


    public void depthfirstsearch(int rootnode) {
        System.out.println("Traversing in  DFS manner");
        boolean visited[] = new boolean[vertices];
        DFSearch(rootnode, visited);
    }


    public static void main(String[] args) {

        DFS g = new DFS(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        System.out.println("Grapth printed: ");
        g.printGraph();
        System.out.println();

        g.depthfirstsearch(0);

    }



}
