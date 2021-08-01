package PACKAGE_NAME;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonSubsequenceTest {

    @Test
    public void testLCS() {
        //given
        String expected = "CDNNCGTED";
        //when
        String actual = LongestCommonSubsequence.lcs("GCCDENNTCGCTEED", "CDCNFNCMGGTKED");
        //then
        Assert.assertEquals(expected, actual);
    }
}
