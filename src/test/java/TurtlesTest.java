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


}