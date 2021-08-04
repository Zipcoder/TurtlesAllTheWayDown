package PACKAGE_NAME;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonSubsequenceTest {
    @Test
    public void lcsTest1() {
        // Given
        String expectedString = "GGCAACG";

        // When
        String actualString = LongestCommonSubsequence.lcs("GGCACCACG","ACGGCGGATACG");

        // Then
        Assert.assertEquals(expectedString,actualString);

    }

    @Test
    public void lcsTest2() {
        // Given
        String expectedString = "GGCAACG";

        // When
        String actualString = LongestCommonSubsequence.lcs("ACGGCGGATACG","GGCACCACG");

        // Then
        Assert.assertEquals(expectedString,actualString);

    }

    @Test
    public void lcsTest3() {
        // Given
        String expectedString = "GCGCG";

        // When
        String actualString = LongestCommonSubsequence.lcs("GCCCTAGCG","GCGCAATG");

        // Then
        Assert.assertEquals(expectedString,actualString);

    }
}
