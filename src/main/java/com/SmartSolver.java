import java.util.List;
import java.util.LinkedList;

import main.java.com.Location;
import main.java.com.Request;
import main.java.com.Vehicle;

class SmartSolver {
    private List<Location> locations;
    private List<Vehicle> vehicles;
    private List<Request> requests;

    public SmartSolver() {
        locations = new LinkedList<Location>();
        vehicles = new LinkedList<Vehicle>();
        requests = new LinkedList<Request>();
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
    }

}
