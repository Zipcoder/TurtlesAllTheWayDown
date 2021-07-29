import PACKAGE_NAME.Turtles;
import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.Target;
import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {
    @Test
    public void testFactorial(){
        //given
        Long expectedValue=720l;
        //when
        Long actualValue=Turtles.factorial(6);
        //then
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testGcd(){
        //given
        int expectedValue=34;
        //when
        int actualValue=Turtles.gcd(102,68);
        //then
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testGcd2(){
        //given
        int expectedValue=24;
        //when
        int actualValue=Turtles.gcd2(1440,408);
        //then
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testTiming(){
        //given
        BigInteger bi1 = new BigInteger("89798763754892653453379597352537489494736");
        Instant startGcd1 = Instant.now();
        Turtles.gcd(10,2147483647);
        Instant finishGcd1 = Instant.now();
        long expectedValue = Duration.between(startGcd1, finishGcd1).toMillis();
        Instant startGcd2 = Instant.now();
        Turtles.gcd2(10,2147483647);
        Instant finishGcd2 = Instant.now();
        //when
        long actualValue = Duration.between(startGcd1, finishGcd1).toMillis();
        //then
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testLongestCommonSubsequenceProblem(){
        //given
        String expectedValue="GGCAACG";
        //when
        String actualValue=Turtles.lcs("GGCACCACG","ACGGCGGATACG");
        //then
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testLongestCommonSubsequenceProblem2(){
        //given
        String expectedValue="GCGCG";
        //when
        String actualValue=Turtles.lcs("GCCCTAGCG","GCGCAATG");
        //then
        Assert.assertEquals(expectedValue,actualValue);
    }

}