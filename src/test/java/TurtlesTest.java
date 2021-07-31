import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {
    @Test
public void testFactorial(){
    //given
        int n=2;
        int expected =2;
    //when
    int actual= PACKAGE_NAME.Turtles.factorial(n);
    //then
        Assert.assertEquals(expected,actual);
}
}