import PACKAGE_NAME.LongestCommonSubsequence;
import org.junit.Assert;
import org.junit.Test;

public class testLongestCommonSubsequence {

    @Test
    public void testLCSA(){

        String result = LongestCommonSubsequence.lcs("GGCACCACG", "ACGGCGGATACG");
        String expected = "GGCAACG";

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testLCSB(){
        String result = LongestCommonSubsequence.lcs("GCCCTAGCG", "GCGCAATG");
        String expected = "GCGCG";

        Assert.assertEquals(expected, result);
    }
}
