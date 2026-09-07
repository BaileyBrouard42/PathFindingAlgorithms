import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Dijkstra {

    Map<String,Integer> distances;
    Map<String,String> previous;

    public void findShortestPaths(Graph graph, String startId) {
        distances = new HashMap<>();
        previous = new HashMap<>();
        distances.put(startId, 0);

        PriorityQueue<NodeDistance> queue = new PriorityQueue<>();
        queue.add(new NodeDistance(startId, 0));

        while(!queue.isEmpty()) {
            NodeDistance current = queue.poll(); //gets the smallest distance in the priority queue and removes it
            List<Edge> neighbours = graph.getNeighbors(current.nodeId); //gets the neighbours of the current node

            if(neighbours == null) { //If there is a dead end continue to the next available
                continue; 
            }
            
            for(Edge edge : neighbours) { 

                int newDistance = current.distance + edge.getWeight(); //adding the distances between nodes

                if(!distances.containsKey(edge.getDestinationId()) || newDistance < distances.get(edge.getDestinationId())) { //If its a new ID or the new distance is smaller
                    distances.put(edge.getDestinationId(), newDistance); //Putting the new updated distance into distances
                    queue.add(new NodeDistance(edge.getDestinationId(), newDistance)); //Adding this node to the queue to be explored
                    previous.put(edge.getDestinationId(), current.nodeId); //Putting the previous node in the list to build the path
                }
            }
        }
    }
    public Map<String,Integer> getDistances() {
        return distances;
    }

    public List<String> getShortestPath(String targetId){
        List<String> path = new ArrayList<>();
        String current = targetId;

        while(current != null) {
            path.add(current);
            current = previous.get(current); //Constructs a list in reverse of the best cheapest path
        }
        Collections.reverse(path);
        return path;
    }


}