package PACKAGE_NAME;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {
    public static int factorial(int n){
        if (n == 1) return 1;
        return n * factorial(n-1);
    }
    public static int gcd(int p,int q){
        if(q==0) {
            return p;
        }
        else {
            return gcd(q, p % q);
        }
    }

}
