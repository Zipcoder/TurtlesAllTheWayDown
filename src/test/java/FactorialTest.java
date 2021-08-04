import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void factorialTest1() {
        //given
        Long expected = 720L;

        //when
        Long actual = Factorial.factorial(6);

        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void factorialTest2(){
        //given
        Long expected = 39916800L;

        //when
        Long actual = Factorial.factorial(11);

        //then
        Assert.assertEquals(expected,actual);
    }
}
