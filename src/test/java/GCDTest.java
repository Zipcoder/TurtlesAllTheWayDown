import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

public class GCDTest {
    @Test
    public void testTime(){

        Instant start1 = Instant.now();
        GCD.gcd(233123,2);
        // CODE to be timed goes HERE
        Instant finish1 = Instant.now();
        long timeElapsed1 = Duration.between(start1, finish1).toMillis();

        Instant start2 = Instant.now();
        GCD.gcd2(233123,2);
        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start2, finish2).toMillis();

        Assert.assertTrue(timeElapsed1 > timeElapsed2);

        System.out.println(timeElapsed1);
        System.out.println(timeElapsed2);

    }


}
