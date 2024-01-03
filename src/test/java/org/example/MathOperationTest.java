package org.example;
import org.example.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class MathOperationTest {

    @Test
    public void testAdd(){
        Assert.assertEquals(11.0, MathOperation.add.calculate(5,6),0.0);
    }

    @Test
    public void testSubtract(){
        Assert.assertEquals(6.0, MathOperation.subtract.calculate(16, 10), 0.0);
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(12, MathOperation.multiply.calculate(4, 3), 0.0);
    }

    @Test
    public void testDivide(){
        Assert.assertEquals(3, MathOperation.divide.calculate(6, 2), 0.0);
    }
}
