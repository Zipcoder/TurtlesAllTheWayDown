import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {
    Turtles turtles = Turtles.getInstance();

    @Test
    public void factorialTest(){
        //given
        int n = 3;
        int expected = 6;

        //when
        int actual = turtles.factorial(n);

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void factorialTest2(){
        //given
        int n = 9;
        int expected = 362880;

        //when
        Instant start = Instant.now();
        int actual = turtles.factorial(n);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();

        //then
        Assert.assertEquals(expected, actual);
        System.out.println(timeElapsed);
    }

    @Test
    public void divisorTest(){
        //given
        int x = 1440;
        int y = 408;
        int expected = 24;

        //when
        Instant start = Instant.now();
        int actual = turtles.greatestCommDiv(x, y);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();


        //then
        Assert.assertEquals(expected, actual);
        System.out.println(timeElapsed);
    }
    @Test
    public void divisorTest2() {
        //given
        int x = 25570;
        int y = 650;
        int expected = 10;

        //when
        Instant start = Instant.now();
        int actual = turtles.greatestCommDiv(x, y);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();


        //then
        Assert.assertEquals(expected, actual);
        System.out.println(timeElapsed);
    }

    @Test
    public void longestComSeqTest (){
        //given
        String one = "GGCACCACG";
        String two = "ACGGCGGATACG";
        String expected = "GGCAACG";

        //when
        String actual = turtles.longestComSeq(one, two);

        //then
        Assert.assertEquals(expected, actual);

    }

}