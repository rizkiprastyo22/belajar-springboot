package com.mandiri.handson_oop.test;

import com.mandiri.handson_oop.calculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void summation_should_return10_when_6add4() {
        //given
        int num1 = 6;
        int num2 = 4;
        //when
        Calculator calculator = new Calculator();
        int actual = calculator.summation(num1, num2);
        //then
        assertEquals(10, actual);
    }


    @Test
    public void summation_shouldNot_return7_when_6add4() {
        //given
        int num1 = 6;
        int num2 = 4;
        //when
        Calculator calculator = new Calculator();
        int actual = calculator.summation(num1, num2);
        //then
        assertNotEquals(7, actual);
    }

}
