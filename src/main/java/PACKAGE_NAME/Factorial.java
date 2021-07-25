package PACKAGE_NAME;

public class Factorial {

    public static Integer factorial(int f){
        if(f == 1) return 1;
        if(f < 1) return f;
        return f * factorial(f - 1);
    }
}
