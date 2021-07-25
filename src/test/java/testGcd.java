import PACKAGE_NAME.Gcd;
import org.junit.Assert;
import org.junit.Test;
import sun.jvm.hotspot.oops.Instance;

import java.time.Duration;
import java.time.Instant;

public class testGcd {

    @Test
    public void testGCD1(){
        Integer expected = 5;
        Integer actual = Gcd.gcd(10, 5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGCD2(){
        Integer expected = 50;
        Integer actual = Gcd.gcd2(1000, 350);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTiming(){

        Instant beginFirst = Instant.now();
        Gcd.gcd(1002234000, 23432);
        Instant endFirst = Instant.now();

        Instant beginSecond = Instant.now();
        Gcd.gcd2(1002234000, 23432);
        Instant endSecond = Instant.now();

        long timeElapsed1 = Duration.between(beginFirst, endFirst).toMillis();
        long timeElapsed2 = Duration.between(beginSecond, endSecond).toMillis();

        boolean actual = timeElapsed1 > timeElapsed2;
        System.out.println(timeElapsed1 + ", " + timeElapsed2);

        Assert.assertTrue(actual);
    }
}
