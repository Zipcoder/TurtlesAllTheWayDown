import PACKAGE_NAME.God;
import org.junit.Assert;
import org.junit.Test;
import sun.jvm.hotspot.utilities.AssertionFailure;

import java.time.Instant;

public class TestGod {

    @Test
    public void testGcd1 () {
        Integer expected = 3;
        Integer actual = God.gcd(300000, 3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGcd_NonRecursive () {
        Integer expected = 3;
        Integer actual = God.gcd(300000, 3);

        Assert.assertEquals(expected, actual);
    }

    // this test is meant to fail
    @Test
    public void timeStamp () {
        God god = new God();
        Instant start = Instant.now();
        god.semiDeathLoop();
        Instant finish = Instant.now();

        Assert.assertEquals(start, finish);
    }
}
