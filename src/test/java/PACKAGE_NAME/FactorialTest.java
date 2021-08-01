package PACKAGE_NAME;

import PACKAGE_NAME.Factorial;
import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void testFactorial1() {
        //given
        long expected = 1L;
        //when
        long actual = Factorial.factorial(1);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFactorialWithLargerNumber() {
        //given
        long expected = 40320;
        //when
        long actual = Factorial.factorial(8);
        //then
        Assert.assertEquals(expected, actual);
    }
}
