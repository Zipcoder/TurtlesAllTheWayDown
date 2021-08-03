package PACKAGE_NAME;

import PACKAGE_NAME.Factorial;
import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

import static org.junit.Assert.*;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {

    @Test
    public void factorial(){
        int g = 1;
        long expected = 1;
        Factorial fact = new Factorial();

        long actual = fact.factorial(g);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void gcdTest(){
        int p = 8;
        int q = 12;

        GCD otro = new GCD();
        int expected = 4;

        int actual = otro.gcd(p,q);

        Assert.assertEquals(expected, actual);
    }

@Test
    public void timeTest(){
        int p = 3768;
        int q = 17010;
    Instant start1 = Instant.now();
    GCD.gcd(p,q);
    Instant finish1 = Instant.now();
    long elTiempoQPaso = Duration.between(start1,finish1).toMillis();
    Instant start2 = Instant.now();
    GCD.gcd2(p,q);
    Instant finish2 = Instant.now();
    long elTiempoQPaso2 = Duration.between(start2,finish2).toMillis();

    Assert.assertTrue(elTiempoQPaso>elTiempoQPaso2);
}

}