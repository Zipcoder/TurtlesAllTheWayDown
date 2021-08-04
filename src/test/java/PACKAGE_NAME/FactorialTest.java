package PACKAGE_NAME;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void testFactorial1(){
        // Given
        long expectedNumber = 1L;

        // When
        long actualNumber = Factorial.factorial(1);

        // Then
        Assert.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void testFactorial2(){
        // Given
        long expectedNumber = 120L;

        // When
        long actualNumber = Factorial.factorial(5);

        // Then
        Assert.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void testFactorial3(){
        // Given
        long expectedNumber = 3628800L;

        // When
        long actualNumber = Factorial.factorial(10);

        // Then
        Assert.assertEquals(expectedNumber, actualNumber);
    }
}
