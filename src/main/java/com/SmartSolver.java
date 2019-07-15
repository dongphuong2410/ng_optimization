package main.java.com;

import java.util.*;

import main.java.com.Location;
import main.java.com.Request;
import main.java.com.Vehicle;

public class SmartSolver {
    private ArrayList<Location> locations;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Request> requests;

    public SmartSolver() {
        locations = new ArrayList<Location>();
        vehicles = new ArrayList<Vehicle>();
        requests = new ArrayList<Request>();
    }

    public void readInput() {
        //Add 12 locations
        locations.add(new Location(4, 3, "Q1-01"));
        locations.add(new Location(2, 4, "Q1-02"));
        locations.add(new Location(3, 6, "Q1-03"));
        locations.add(new Location(5, 10, "Q3-01"));
        locations.add(new Location(4, 12, "Q3-02"));
        locations.add(new Location(5, 13, "Q3-03"));
        locations.add(new Location(8, 13, "Q3-04"));
        locations.add(new Location(7, 10, "Q3-05"));
        locations.add(new Location(11, 7, "Q9-01"));
        locations.add(new Location(11, 6, "Q9-02"));
        locations.add(new Location(13, 5, "Q9-03"));
        locations.add(new Location(13, 3, "Q9-04"));

        //Add some vehicles of 3 types : 1500kg, 1000kg, 500kg
        for (int i = 1; i <= 10; i++) {
            vehicles.add(new Vehicle("V1.5T-" + i, 1500));
        }
        for (int i = 1; i <= 10; i++) {
            vehicles.add(new Vehicle("V1.0T-" + i, 1000));
        }
        for (int i = 1; i <= 10; i++) {
            vehicles.add(new Vehicle("V0.5T-" + i, 500));
        }
        
        //Add some requests
        requests.add(new Request("Chicken", 50, "Q9-01", "Q1-01"));
        requests.add(new Request("Apple", 200, "Q9-01", "Q1-03"));
        requests.add(new Request("Brocolli", 150, "Q9-01", "Q3-03"));
        requests.add(new Request("Pork", 200, "Q9-01", "Q3-02"));
        requests.add(new Request("Beef", 90, "Q9-01", "Q1-02"));
        requests.add(new Request("Bread", 10, "Q9-01", "Q1-02"));

        requests.add(new Request("Clothes", 300, "Q9-01", "Q3-05"));
        requests.add(new Request("Shoe", 150, "Q9-01", "Q9-02"));

        requests.add(new Request("Axit", 100, "Q9-01", "Q3-04"));
        requests.add(new Request("Shampoo", 300, "Q9-01", "Q1-03"));
        requests.add(new Request("Toothpaste", 200, "Q9-01", "Q3-01"));

        requests.add(new Request("Brick", 600, "Q9-01", "Q9-04"));
        requests.add(new Request("Wood", 700, "Q9-01", "Q9-02"));
        requests.add(new Request("Stone", 1100, "Q9-01", "Q9-03"));
    }

    public void solve() {
        for (int i = 0; i < vehicles.size(); i++) {
            if (requests.isEmpty()) {
                break;
            }
            Vehicle vehicle = vehicles.get(i);
            ArrayList<Request> feasibleReqs = getFeasibleRequest(vehicle, requests);
            for (int j = 0; j < feasibleReqs.size(); j++) {
                Request toBeAssigned = feasibleReqs.get(j);
                if (vehicle.getTotalWeight() + toBeAssigned.getWeight() > vehicle.getCapacity()) {
                    break;
                }
                vehicle.addRequest(toBeAssigned);
                requests.remove(toBeAssigned);
            }
        }
    }

    public void preprocess() {
        clusterLocations();
        sortVehicles();
        sortRequests();

        System.out.println("======VEHICLE LIST======");
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.print(vehicles.get(i).getId() + " ");
        }
        System.out.println();

        System.out.println("======REQUEST LIST======");
        for (int i = 0; i < requests.size(); i++) {
            System.out.println(requests.get(i).toString());
        }
    }

    public void printSolution() {
        int totalDelivered = 0;
        System.out.println("Schedule of vehicles: ");
        for (Iterator i = vehicles.iterator(); i.hasNext();) {
            Vehicle v = (Vehicle) i.next();
            List<Request> assignedReqs = v.getRequests();
            if (assignedReqs.size() > 0) {
                System.out.println("Vehicle " + v.getId() + " " + v.getRequests().size() + " request(s), " + v.getTotalWeight() + " kg");
                for (int j = 0; j < assignedReqs.size(); j++) {
                    System.out.println("\t" + (j+1) + " " +  assignedReqs.get(j).toString());
                }
                totalDelivered += assignedReqs.size();
            }
        }
        
        System.out.println("TOTAL REQUEST : " + requests.size());
        System.out.println("DELIVERED REQUEST : " + totalDelivered);
        System.out.println("REMAIN : " + requests.size());
    }

    private void clusterLocations() {
        //TODO
    }

    private void sortVehicles() {
        Collections.sort(vehicles, Collections.reverseOrder(new Comparator<Vehicle>() {
            public int compare(Vehicle vehOne, Vehicle vehTwo) {
                return (vehOne.getCapacity() - vehTwo.getCapacity());    
            }
        }));
    }

    private void sortRequests() {
        //Sort requests by weight first
        Collections.sort(requests, Collections.reverseOrder(new Comparator<Request>() {
            public int compare(Request reqOne, Request reqTwo) {
                return (reqOne.getWeight() - reqTwo.getWeight());    
            }
        }));
        //Sort requests one more time, by delivery
        ArrayList<Request> newRequests = new ArrayList<Request>();
        for (int i = 0; i < locations.size(); i++) {
            for (int j = 0; j < requests.size(); j++) {
                if (requests.get(j).getDeliveryLoc().equals(locations.get(i).getCode())) {
                    newRequests.add(requests.get(j));
                }
            }
        }
        requests = newRequests;
    }

    private ArrayList<Request> getFeasibleRequest(Vehicle vehicle, ArrayList<Request> requests) {
        
        return (ArrayList<Request>)requests.clone();
    }

}
