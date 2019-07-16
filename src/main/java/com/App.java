package com;

import main.java.com.SmartSolver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        testBasic(); 
        testFoodConstraint();
        testForbiddenRoadConstraint();
    }

    private static void testBasic() {
        System.out.println("BASIC VEHICLE PLANNING");
        SmartSolver solver = new SmartSolver();
        solver.readInput();
        solver.preprocess();
        solver.solve();
        solver.printSolution();
    }

    /* Food cannot go with chemicals */
    private static void testFoodConstraint() {
        System.out.println("VEHICLE PLANNING WITH FOOD CONSTRAINT");
        SmartSolver solver = new SmartSolver();
        solver.readInputWithFoodConstraint();
        solver.preprocess();
        solver.solve();
        solver.printSolution();
    }

    /* Forbidden Road constraint 
       1.5T vehicle cannot go to district 1 and 3
    */
    private static void testForbiddenRoadConstraint() {
        System.out.println("VEHICLE PLANNING WITH FORBIDDEN ROAD CONSTRAINT");
        SmartSolver solver = new SmartSolver();
        solver.readInputWithForbiddenRoadConstraint();
        solver.preprocess();
        solver.solve();
        solver.printSolution();
    }
}
