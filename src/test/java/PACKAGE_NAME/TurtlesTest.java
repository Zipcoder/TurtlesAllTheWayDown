package PACKAGE_NAME;

import PACKAGE_NAME.Factorial;
import org.junit.Assert;
import org.junit.Test;

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



}