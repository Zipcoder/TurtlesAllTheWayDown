package PACKAGE_NAME;

public class Factorial {

    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        else return n * factorial(n - 1);
    }


}
