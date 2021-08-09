import PACKAGE_NAME.Turtles;
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
@Test
    public void testGCD(){
        //given
    int p=102;
    int q=68;
    int expected=34;

    //when
    int actual= Turtles.gcd(p,q);

    //then
    Assert.assertEquals(expected,actual);
}

@Test
    public void testLCS(){
    //given
    String s="GGCACCACG";
    String t="ACGGCGGATACG";
    String expected="GGCACCACG";
    //
    String actual=Turtles.longestCommonSubsequence(s,t);
    //
    Assert.assertEquals(expected,actual);
}
}