class Request {
    private String id;
    private int weight;
    private String pickupLoc;
    private String deliveryLoc;

    public Request(String id, int weight, String pickupLoc, String deliveryLoc) {
        this.id = id;
        this.weight = weight;
        this.pickupLoc = pickupLoc;
        this.deliveryLoc = deliveryLoc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPickupLoc() {
        return pickupLoc;
    }

    public void setPickupLoc(String loc) {
        this.pickupLoc = loc;
    }

    public String getDeliveryLoc() {
        return deliveryLoc;
    }

    public void setDeliveryLoc(String loc) {
        this.deliveryLoc = loc;
    }
}
