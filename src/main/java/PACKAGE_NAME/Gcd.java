package PACKAGE_NAME;

public class Gcd {

    public static int gcd(int p, int q){
        if(q == 0)
            return p; //This will always be the last statement, recursive or not
        else
            return gcd(q, p % q);
    }

    public static int gcd2(int p, int q){

        while(q > 0){
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }
}
