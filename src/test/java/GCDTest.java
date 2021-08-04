import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

public class GCDTest {
    @Test
    public void timeComparison(){


        Instant start1 = Instant.now();
        Euclid.gcd(5000,10);
        Instant finish1 = Instant.now();
        long timeElapsed1 = Duration.between(start1, finish1).toMillis();

        Instant start2 = Instant.now();
        Euclid.gcd2(5000,10);
        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start2, finish2).toMillis();

        Assert.assertTrue(timeElapsed1 > timeElapsed2);
    }

}
