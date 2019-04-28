package pl.edu.agh.mwo.calculator;

import static org.junit.Assert.*;
import org.junit.Test;

import junit.framework.Assert;

public class calculatorTest 
{
    @Test
    public void testSum(){
        Calculator calc = new Calculator();
        Assert.assertEquals(12, calc.sum(5, 7));
    }

    @Test
    public void testSubstract(){
        Calculator calc = new Calculator();
        Assert.assertEquals(5, calc.substract(7, 2));
    }

    @Test
    public void testMultiply(){
        Calculator calc = new Calculator();
        Assert.assertEquals(9, calc.multipy(3,3));
    }

    //@Test
    // public void testMultiplyArgs(){
    //     Calculator calc = new Calculator();
    //     calc.multipyArgs(3, 2, 5, 4);
    // }


    @Test
    public void testDivide(){
        Calculator calc = new Calculator();
        Assert.assertEquals(1, calc.divide(3,3));
    }

    @Test(expected = Exception.class)
    public void testDivideByZero(){
        Calculator calc = new Calculator();
        calc.divide(5, 0);
    }

}