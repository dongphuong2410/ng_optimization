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
        SmartSolver solver = new SmartSolver();
        solver.readInput();
        solver.preprocess();
        solver.solve();
        solver.printSolution();
    }
}
