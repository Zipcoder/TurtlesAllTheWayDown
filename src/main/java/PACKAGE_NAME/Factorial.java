package PACKAGE_NAME;

public class Factorial {

    public static Integer factorial (int f) {
        if (f == 0) {
            return 1;
        }
        return f * factorial(f - 1);
    }
}
