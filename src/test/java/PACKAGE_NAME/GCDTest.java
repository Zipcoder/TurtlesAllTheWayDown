package PACKAGE_NAME;

import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

public class GCDTest {

    @Test
    public void testGCD() {
        //given
        int expected = 24;
        //when
        int actual = GCD.gcd(1440, 408);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGCD2() {
        //given
        int expected = 3;
        //when
        int actual = GCD.gcd2(3768, 1701);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTiming() {
        Instant start1 = Instant.now();
        GCD.gcd(3768, 1701);
        Instant finish1 = Instant.now();
        long timeElapsed1 = Duration.between(start1, finish1).toMillis();

        Instant start2 = Instant.now();
        GCD.gcd2(3768, 1701);
        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start2, finish2).toMillis();

        boolean actual = timeElapsed1 > timeElapsed2;
        Assert.assertTrue(actual);
        System.out.println(timeElapsed1);
        System.out.println(timeElapsed2);
    }
}
