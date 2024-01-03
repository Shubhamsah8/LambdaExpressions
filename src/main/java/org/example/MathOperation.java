package org.example;

@FunctionalInterface
interface MathOperationInterface{
    double calculate(double a, double b);
}

public class MathOperation{
    public static MathOperationInterface add = (a,b) -> a+b;
    public static MathOperationInterface subtract = (a,b) -> a-b;
    public static MathOperationInterface multiply = (a,b) -> a*b;
    public static MathOperationInterface divide = (a,b) -> a/b;
}
