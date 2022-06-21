package programmingForDevelopers.oday20Graph.greedyApproach;

public class ShortestPathDijkstra {
    int vertices;
    int[][] matrix;

    ShortestPathDijkstra(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    public void addEdge(int source, int destination, int weight) {
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
            System.out.println();
        }
    }

    public void dijkstra(int source, int destination) {

        int[] distance = new int[vertices];
        int[] prevPath = new int[vertices];
        boolean[] visited = new boolean[vertices];

        //Initially updating distance to infinity
        //and updating prevPath to -1
        for (int i = 0; i < vertices; i++) {
            distance[i] = Integer.MAX_VALUE;
            prevPath[i] = -1;
        }
        //Distance from source to source is zero
        distance[source] = 0;

        for (int i = 0; i < vertices; i++) {
            //Finding minimum vertex i.e vertex having minimum distance
            int u = findMinVertex(distance, visited);
            visited[u] = true;

            //Finding adjacent nodes of u
            for (int j = 0; j < vertices; j++) {
                if (matrix[u][j] != 0 & !visited[j]) {
                    int v = j;
                    int newDistance = distance[u] + matrix[u][j];
                    if (newDistance < distance[v]) {
                        distance[v] = newDistance;
                        prevPath[v] = u;
                    }
                }
            }
        }

        //Printing distance
        System.out.println("\nShortest distance from source(" + source + ") to destination(" + destination + ") is : " + distance[destination]);

        //Printing the shortest path

        int[] shortestPath = new int[vertices];
        int vertex = destination;
        int count = 0;
        
        while (vertex != -1){
            shortestPath[count] = vertex;
            vertex = prevPath[vertex];
            count++;
        }
        
        System.out.println("\nShortest path is : ");
        for (int i = count -1;  i>=0; i--){
            System.out.print(shortestPath[i] + " , ");
        }
        System.out.println();
    }

    public int findMinVertex(int[] distance, boolean[] visited) {
        int minVertex = -1;
        for (int i = 0; i < vertices; i++) {
//            if(minVertex==-1 && !visited[i]){
//                minVertex=i;
//
//            }
//            else if(distance[minVertex]>distance[i] && !visited[i]){
//                minVertex=i;
//            }

            if ((minVertex == -1 || distance[minVertex] > distance[i]) & !visited[i]) {
                minVertex = i;
            }
        }
        return minVertex;
    }


    public static void main(String[] args) {
        ShortestPathDijkstra g = new ShortestPathDijkstra(6);
        g.addEdge(0, 1, 10);
        g.addEdge(0, 2, 5);
        g.addEdge(0, 5, 100);
        g.addEdge(1, 3, 20);
        g.addEdge(1, 2, 30);
        g.addEdge(2, 4, 10);
        g.addEdge(3, 4, 5);
        g.addEdge(3, 5, 15);
        g.addEdge(4, 5, 15);

        System.out.println(" ");
        g.printGraph();


        g.dijkstra(0, 5);

    }


}
