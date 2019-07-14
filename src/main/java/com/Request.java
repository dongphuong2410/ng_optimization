package main.java.com;

public class Request {
    private String id;
    private int weight;
    private String pickupLoc;
    private String deliveryLoc;
    private String desc;
    private static int counter;

    public Request(String desc, int weight, String pickupLoc, String deliveryLoc) {
        this.desc = desc;
        this.weight = weight;
        this.pickupLoc = pickupLoc;
        this.deliveryLoc = deliveryLoc;
        this.id = "REQ-" + (counter++);
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
