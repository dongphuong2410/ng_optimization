package main.java.com;

import main.java.com.label.LabelSet;

public class Request {
    private String id;
    private int weight;
    private String pickupLoc;
    private String deliveryLoc;
    private String desc;
    private LabelSet labels;
    private static int counter;

    public Request(String desc, int weight, String pickupLoc, String deliveryLoc) {
        this.desc = desc;
        this.weight = weight;
        this.pickupLoc = pickupLoc;
        this.deliveryLoc = deliveryLoc;
        this.id = "REQ-" + (counter++);
        this.labels = new LabelSet();
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

    public String toString() {
        return "REQ " + id + " : " + weight + " kg of " + desc + " (From " + pickupLoc + " to " + deliveryLoc + ")";
    }

    public LabelSet getLabelSet() {
        return labels;
    }
}
