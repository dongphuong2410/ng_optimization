package main.java.com;

import java.util.List;
import java.util.LinkedList;

import main.java.com.Request;

public class Vehicle {
    private String id;
    private int capacity;
    private List<Request> assignedReqs;

    public Vehicle(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
        assignedReqs = new LinkedList<Request>();
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

}
