

public class Turtles {
        private static  final Turtles INSTANCE = new Turtles();

        private Turtles(){};

        public static Turtles getInstance(){
            return INSTANCE;
        }

        public int factorial(int n) {
            if (n == 1){
                return 1;
            }
            return factorial(n-1) * n;
        }

        public
    }

