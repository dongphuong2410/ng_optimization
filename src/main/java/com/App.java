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
        //testBasic(); 
        testFoodConstraint();
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
}
