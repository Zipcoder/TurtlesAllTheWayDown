import PACKAGE_NAME.Turtles;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;

import static org.junit.Assert.*;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {
    @Test
    public void testFactorial(){
        //given
        Long expected = 120l;

        //when
        Long actualValue = Turtles.factorial(5);

        //then
        Assert.assertEquals(expected,actualValue);
    }

    @Test
    public void testGcd(){
        //given
        int expected =34;

        //when
        int actual = Turtles.gcd(102,68);

        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGcd2(){
        //given
        int expected = 24;

        //when
        int actual = Turtles.gcd2(1440,408);

        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTiming(){
        //given
        BigInteger bi1 = new BigInteger("89798763754892653453379597352537489494736");
        Instant startGcd1 = Instant.now();
        Turtles.gcd(10,2147483647);
        Instant endGcd1 = Instant.now();
        long expectedValue = Duration.between(startGcd1, endGcd1).toMillis();
        Instant startGcd2 = Instant.now();
        Turtles.gcd2(10,2147483647);
        Instant endGcd2 = Instant.now();
        //when
        long actualValue = Duration.between(startGcd2,endGcd2).toMillis();
        //then
        Assert.assertEquals(expectedValue,actualValue);

    }

    @Test
    public void testLcs1(){
        String expected ="GGCAACG";;

        //when
        String actual = Turtles.lcs("GGCACCACG","ACGGCGGATACG");

        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testLcs2(){
        String expected = "GCGCG";

        //when
        String actual = Turtles.lcs("GCCCTAGCG","GCGCAATG");

        //then
        Assert.assertEquals(expected,actual);

    }


}