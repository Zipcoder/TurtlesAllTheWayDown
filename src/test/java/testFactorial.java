import PACKAGE_NAME.Factorial;
import org.junit.Assert;
import org.junit.Test;

public class testFactorial {

    @Test
    public void testFact1(){
        Integer expected = 120;
        Integer actual = Factorial.factorial(5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFactWhen1(){
        Integer expected = 1;
        Integer actual = Factorial.factorial(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFactWhenLessThan1(){
        Integer expected1 = 0;
        Integer expected2 = -2;

        Integer actual1 = Factorial.factorial(expected1);
        Integer actual2 = Factorial.factorial(expected2);

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }
}
