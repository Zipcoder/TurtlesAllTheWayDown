import PACKAGE_NAME.LongestSubSeq;
import org.junit.Assert;
import org.junit.Test;

public class TestLCS {

    @Test
    public void longestCommonSubSeqTest () {
        LongestSubSeq lcs = new LongestSubSeq();
        String x = "ADFLJAKBQCWCQASDFLBAISDBF";
        String y = "ADFLJACKADFJASDKFNQKF";
        Integer expected = 5;

        Integer actual = lcs.longestSubSeq(x, y, 0, 0);

        Assert.assertEquals(expected, actual);
    }
}
