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
    public static String longestCommonSubsequence(String s,String t){
        String small="";
        String large="";
        String result="";
        if(s.length()<t.length()){
            small=s;
            large=t;
        }
        else small=t;large=s;
        for(int i=0;i<small.length();i++){
            if(small.charAt(i)==large.charAt(i)){
                result+=small.charAt(i);
            }
        }
        return result;
    }

}
