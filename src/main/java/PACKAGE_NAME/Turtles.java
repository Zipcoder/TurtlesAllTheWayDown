package PACKAGE_NAME;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {

    public static long factorial(int n){
        if(n == 1)
            return 1;
        return n * factorial(n-1);
    }

    public static int gcd(int p , int q){
        if(q == 0)
            return p;
        else
            return gcd(q,p % q);
        }


    public static int gcd2(int p , int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }
    public static String lcs(String x, String y){
        int m = x.length();
        int n = y.length();
        int[][] option = new int[m+1][n+1];
        for (int i = m-1; i >=0 ; i--) {
            for (int j = n-1; j >=0; j--) {
                if(x.charAt(i)==y.charAt(j)) {
                    option[i][j] = option[i + 1][j + 1] + 1;
                }
                else{
                    option[i][j] = Math.max(option[i+1][j] , option[i][j+1]);

            }

            }

        }
        //recover lcs itself
        String lcs = "";
        int i = 0; int j = 0;
        while(i<m && j<n){
            if(x.charAt(i)==y.charAt(j)){
                lcs+= x.charAt(i);
                i++;
                j++;

            }
            else if(option[i+1][j] >= option[i][j+1])
            {
                i++;
            }
            else{
                j++;
            }
        }
        return lcs;

    }


}
