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

    /**
     * Main method to print all the lambda expressions values.
     * @param args
     */
    public static void main(String[] args){
        /**
         * Declared all the method's variables for inputs.
         */
        double result = add.calculate(5,6);
        double result1 = subtract.calculate(9,6);
        double result2 = multiply.calculate(5,3);
        double result3 = divide.calculate(6,3);

        /**
         * Printing all the function's values.
         */
        System.out.println("Addition: "+result);
        System.out.println("Subtraction: "+result1);
        System.out.println("Multiplication: "+result2);
        System.out.println("Division: "+result3);
    }

}

