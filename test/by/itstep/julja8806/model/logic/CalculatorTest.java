package by.itstep.julja8806.model.logic;


import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testSum() {

        int a = 10;
        int b = 3;
        int expected = 13;

        int actual = Calculator.sum(a, b);


            assertEquals(expected, actual);

    }

    @Test
    public void testSub() {

        int a = 10;
        int b = 3;
        int expected = 7;

        int actual = Calculator.sub(a, b);


        assertEquals(expected, actual);
    }


    @Test
    public void testMul() {

        int a = 10;
        int b = 3;
        int expected = 30;

        int actual = Calculator.mul(a, b);


        assertEquals(expected, actual);
    }


    @Test
    public void testDiv() {

        int a = 10;
        int b = 3;
        int expected = 3;

        int actual = Calculator.div(a, b);


            assertEquals(expected, actual);
        }

        @Test(expected = ArithmeticException.class)
        public void testDivByZero() {

            int a = 10;
            int b = 0;

            Calculator.div(a, b);


        }
    @Test(timeout = 1000)
    public void testMulPower() {

        int a = 10;
        int b = 3;


         Calculator.mul(a, b);



    }
    }
