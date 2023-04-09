package javaadvanced._7;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    /**
     * 1:
     * <p>
     * <p>
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     * <p>
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     * <p>
     * Verify that the methods return the correct result for each test case.
     * <p>
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() { // fix -> il segno + al posto del segno - nel metodo .add
        System.out.println("\nExercise 1: ");
        // Your code here
        Calculator calculator = new Calculator();
        int result;
        result = calculator.add(6, 4);
        Assertions.assertEquals(10, result);

        result = calculator.add(-10, 5);

        Assertions.assertEquals(-5, result);
        result = calculator.add(10, 0);

        Assertions.assertEquals(10, result);

        result = calculator.subtract(10, 6);
        Assertions.assertEquals(4, result);

        result = calculator.subtract(-10, 6);
        Assertions.assertEquals(-16, result);

    }

    /**
     * 2:
     * <p>
     * <p>
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     * <p>
     * Test the same kind of inputs as before as exercise 1
     * <p>
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise2() { // fix -> nel return del metodo .multiply (a*a) -> (a*b)
        System.out.println("\nExercise 2: ");
        // Your code here
        int result;
        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0)); // ci aspettiamo una exception come risultato
        result = calculator.multiply(10, 0);
        Assertions.assertEquals(0, result);

        Assertions.assertEquals(-10, calculator.divide(-10, 1));


    }

    /**
     * 3:
     * <p>
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     * <p>
     * If there is an error you may have to change the code in Calculator to fix it!
     * <p>
     * Don't just write tests that use the result of the program as the expected!!
     */
    @Test
    void exercise3() { // fix-> l'ordine degli arguments del metodo Math.pow erano invertiti.
        System.out.println("\nExercise 3: ");
        // Your code here
        double result;
        Calculator calculator = new Calculator();
        result = calculator.power(0.0, 10.0);
        Assertions.assertEquals(0, result);

        result = calculator.power(2, 0);
        Assertions.assertEquals(1, result);

        result = calculator.power(-5, 1);
        Assertions.assertEquals(-5, result);

        result = Math.round(calculator.power(6, -2));
        Assertions.assertEquals(Math.round(0.27), result);
    }
}