import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void testFactorial(){
        long expected = 2L;

        long actual = Factorial.factorial(2);

        Assert.assertEquals(expected, actual);
    }


}
