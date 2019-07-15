package main.java.com;

import java.util.List;
import java.util.LinkedList;

import main.java.com.Request;
import main.java.com.label.LabelSet;
import main.java.com.label.Label;

public class Vehicle {
    private String id;
    private int capacity;
    private List<Request> assignedReqs;
    private LabelSet labels;
public Vehicle(String id, int capacity) { this.id = id; this.capacity = capacity;
        this.assignedReqs = new LinkedList<Request>();
        this.labels = new LabelSet();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addRequest(Request request) {
        assignedReqs.add(request);
    }

    public List<Request> getRequests() {
        return assignedReqs;
    }

    public int getTotalWeight() {
        int sum = 0;
        for (int i = 0; i < assignedReqs.size(); i++) {
            sum += assignedReqs.get(i).getWeight();
        }
        return sum;
    }

    public LabelSet getLabelSet() {
        return labels;
    }

    public void addLabel(Label label) {
        this.labels.addLabel(label);
    }
}
