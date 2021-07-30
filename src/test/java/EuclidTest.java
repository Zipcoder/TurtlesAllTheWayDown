import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

public class EuclidTest {
    @Test
    public void GCDtest_5(){
        //given
        int expected = 5;
        //when
        int actual = Euclid.gcd(100,65);
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void GCDtest_3(){
        //given
        int expected = 3;
        //when
        int actual = Euclid.gcd(99,57);
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void GCDtest_1() {
        //given
        int expected = 1;
        //when
        int actual = Euclid.gcd(12459,527);
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void GCD2test_5(){
        //given
        int expected = 5;
        //when
        int actual = Euclid.gcd(100,55);
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void GCD2test_110(){
        //given
        int expected = 110;
        //when
        int actual = Euclid.gcd(10120,550);
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void gcdVsGcd2Test(){
        //Testing gcd - recursive
        Instant start1 = Instant.now();
        Euclid.gcd(10120123,55034);
        Instant finish1 = Instant.now();
        long timeElapsed = Duration.between(start1, finish1).toMillis();

        //Testing gcd2 - non-recursive
        Instant start2 = Instant.now();
        Euclid.gcd2(10120123,55034);
        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start2, finish2).toMillis();

        System.out.println(timeElapsed);
        System.out.println(timeElapsed2);
    }
}
