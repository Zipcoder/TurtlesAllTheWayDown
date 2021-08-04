import org.junit.Assert;
import org.junit.Test;

public class LCSTest {
    @Test
    public void lcsTest1() {
        String expectedString = "GGCAACG";

        String actualString = LongestCommonSubsequence.lcs("GGCACCACG", "ACGGCGGATACG");

        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void lcsTest2() {
        String expectedString = "GGCAACG";

        String actualString = LongestCommonSubsequence.lcs("ACGGCGGATACG", "GGCACCACG");

        Assert.assertEquals(expectedString, actualString);
    }
}
