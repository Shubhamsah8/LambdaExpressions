package org.example;

/**
 * Created a Functional Interface to calculate the Arithmetic operations.
 */
@FunctionalInterface
interface MathOperationInterface{
    /**
     * Calculate method to calculate the operations by passing two arguments.
     * @param a taking first double value.
     * @param b taking second double value.
     * @return
     */
    double calculate(double a, double b);
}

/**
 * MathOperation class to add the Lambda expressions.
 */
public class MathOperation{
    /**
     * Some Arithmetic operation using lambda expressions.
     */
    public static MathOperationInterface add = (a,b) -> a+b;
    public static MathOperationInterface subtract = (a,b) -> a-b;
    public static MathOperationInterface multiply = (a,b) -> a*b;
    public static MathOperationInterface divide = (a,b) -> (b!=0)? a/b: Double.NaN;

}

