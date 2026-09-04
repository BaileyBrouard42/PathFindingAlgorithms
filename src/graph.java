import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph {

    Map<String, List<Edge>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addEdge (String fromId, String toId, int weight) {
        Edge edge = new Edge(toId, weight);

        if (!adjacencyList.containsKey(fromId)) { //If the destination we are starting from doesnt exist then create one in the map
            adjacencyList.put(fromId, new ArrayList<>());
        } 
        
        adjacencyList.get(fromId).add(edge); //Adding the new edge to the map from the same destination lookup map
    }

    public List<Edge> getNeighbors(String nodeId) { //Getting a list of neighbours from a given node
        return adjacencyList.get(nodeId);
    }





}