package PACKAGE_NAME;

public class God {

    public static Integer gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        return gcd(q, p % q);
    }

    public static Integer gcd2 (int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

    //used to check the actual time stamp
    public void semiDeathLoop () {
        for (int i = 0; i < 1000000; i++) {
            System.out.println("hello");
        }
    }
}
