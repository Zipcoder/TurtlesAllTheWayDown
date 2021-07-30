import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void factorialOf_9(){
        //given
        long input = 9;
        long expected = 362880;
        //when
        long result = Factorial.factorial(input);
        //then
        Assert.assertEquals(expected,result);
    }

    @Test
    public void factorialOf_11(){
        //given
        long input = 11;
        long expected = 39916800;
        //when
        long result = Factorial.factorial(input);
        //then
        Assert.assertEquals(expected,result);
    }

}
