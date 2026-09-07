public class NodeDistance implements Comparable<NodeDistance>{ //this implements means the class can be compared with other NodeDistance objects, makes a meaning for distance finding the shortest in the queue

    String nodeId;
    int distance;

    public NodeDistance(String nodeId, int distance) {
        this.nodeId = nodeId;
        this.distance = distance;
    }

    public int compareTo(NodeDistance other) { //this method doesnt take into account the id just takes away the distances
        return this.distance - other.distance;
    }


}
