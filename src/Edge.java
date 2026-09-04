public class Edge {

    String destinationId;
    int weight;

    public Edge (String destinationId, int weight) {
        this.destinationId = destinationId;
        this.weight = weight;
    }
    
    public String getDestinationId() {
        return destinationId;
    }

    public int getWeight() {
        return weight;
    }


}
