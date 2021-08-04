import org.junit.Assert;
import org.junit.Test;

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
        int actual = turtles.factorial(n);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divisorTest(){
        //given
        int x = 1440;
        int y = 408;
        int expected = 24;

        //when
        int actual = turtles.greatestCommDiv(x, y);

        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void divisorTest2() {
        //given
        int x = 25570;
        int y = 650;
        int expected = 10;

        //when
        int actual = turtles.greatestCommDiv(x, y);

        //then
        Assert.assertEquals(expected, actual);
    }

}