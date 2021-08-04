import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

public class GCDTest {

    @Test
    public void testTimeComparison() {

        Instant start1 = Instant.now();
        GCD.gcd(90390,5898);
        Instant finish1 = Instant.now();
        long timeElapsed1 = Duration.between(start1, finish1).toMillis();


        Instant start2 = Instant.now();
        GCD.gcd2(90390, 5890);
        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start2, finish2).toMillis();

        Assert.assertTrue(timeElapsed1 > timeElapsed2);

    }

    @Test
    public void gcdTest1() {
        int expectedNumber = 44;

        int actualNumber = GCD.gcd(4444, 1408);

        Assert.assertEquals(expectedNumber, actualNumber);

    }

    @Test
    public void gcdTest2() {
        int expectedNumber = 8;

        int actualNumber = GCD.gcd(14408, 1408);

        Assert.assertEquals(expectedNumber, actualNumber);

    }
}