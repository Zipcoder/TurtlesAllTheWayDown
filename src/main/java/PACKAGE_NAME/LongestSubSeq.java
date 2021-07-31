package PACKAGE_NAME;

public class LongestSubSeq {

    public int longestSubSeq (String x, String y, int m, int n) {
        int[][] result = new int[m + 1][n + 1];

        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j < n; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    result[i][j] = result[i - 1][j - 1] + 1;
                } else {
                    result[i][j] = Integer.max(result[i - 1][j], result[i][j - 1]);
                }
            }
        }
        return result[m][n];
    }
}
