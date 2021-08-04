import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public  void testFactorial1() {
        long expectedNumber = 1L;

        long actualNumber = Factorial.factorial(1);

        Assert.assertEquals(expectedNumber, actualNumber);
    }


    @Test
    public  void testFactorial2() {
        long expectedNumber = 120L;

        long actualNumber = Factorial.factorial(5);

        Assert.assertEquals(expectedNumber, actualNumber);
    }


    @Test
    public  void testFactorial3() {
        long expectedNumber = 3628800L;

        long actualNumber = Factorial.factorial(10);

        Assert.assertEquals(expectedNumber, actualNumber);
    }


}
