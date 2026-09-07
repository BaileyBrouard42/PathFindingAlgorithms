import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.List;

public class Dijkstra {

    public static Map<String, Integer> findShortestPaths(Graph graph, String startId) {
        Map<String, Integer> distances = new HashMap<>();
        distances.put(startId, 0);

        PriorityQueue<NodeDistance> queue = new PriorityQueue<>();
        queue.add(new NodeDistance(startId, 0));

        while(!queue.isEmpty()) {
            NodeDistance current = queue.poll(); //gets the samllest distance in the priority queue and removes it
            List<Edge> neighbours = graph.getNeighbors(current.nodeId);

            if(neighbours == null) {
                continue;
            }
            
            for(Edge edge : neighbours) {

                int newDistance = current.distance + edge.getWeight();

                if(!distances.containsKey(edge.getDestinationId()) || newDistance < distances.get(edge.getDestinationId())) {
                    distances.put(edge.getDestinationId(), newDistance);
                    queue.add(new NodeDistance(edge.getDestinationId(), newDistance));
                }
            }
        }
    
        return distances;
    }
}