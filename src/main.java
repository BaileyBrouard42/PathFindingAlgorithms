import java.util.List;

public class Main{

public static void main(String[] args) {
    
    Graph graph = new Graph();
    graph.addEdge("A", "B", 4);
    graph.addEdge("A", "C", 1);
    graph.addEdge("C", "B", 1); //test data
    graph.addEdge("B", "D", 1);
    graph.addEdge("C", "D", 5);

    List<Edge> testA = graph.getNeighbors("A"); //testing neighbours from A

    for (Edge edge : testA) { //for every edge in testA
        System.out.println("A -> " + edge.getDestinationId() + " weight: " + edge.getWeight()); //print each connecting node and its weight
    }

    System.out.println(Dijkstra.findShortestPaths(graph, "A"));


    }
}