package PACKAGE_NAME;

import org.junit.Assert;
import org.junit.Test;
import java.time.Duration;
import java.time.Instant;

public class GCDTest {
    @Test
    public void gcdTest1(){
        // Given
        int expectedNumber = 44;

        // When
        int actualNumber = GCD.gcd1(4444,1408);

        // Then
        Assert.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void gcdTest2(){
        // Given
        int expectedNumber = 8;

        // When
        int actualNumber = GCD.gcd2(14408,1408);

        // Then
        Assert.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void gcdTimeTest(){

        Instant start1 = Instant.now();
        GCD.gcd1(4444, 1408);
        Instant finish1 = Instant.now();
        long timeElapsed1 = Duration.between(start1, finish1).toMillis();

        Instant start2 = Instant.now();
        GCD.gcd2(4444, 1408);
        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start2, finish2).toMillis();

        boolean actual = timeElapsed1 > timeElapsed2;
        Assert.assertTrue(actual);
        System.out.println(timeElapsed1);
        System.out.println(timeElapsed2);
    }
}
