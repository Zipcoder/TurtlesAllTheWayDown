

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

        public int greatestCommDiv(int x, int y){
            while(x > y && y > 0){
                return greatestCommDiv(y, x % y);
            }
            return x;
        }

        public String longestComSeq(String one, String two) {
            int m = one.length(), n = two.length();
            int[][] opt = new int[m + 1][n + 1];
            for (int i = m - 1; i >= 0; i--) {
                for (int j = n - 1; j >= 0; j--) {
                    if (one.charAt(i) == two.charAt(j)) {
                        opt[i][j] = opt[i + 1][j + 1] + 1;
                    } else {
                        opt[i][j] = Math.max(opt[i + 1][j], opt[i][j + 1]);
                    }
                }
            }

            // Recover LCS itself.
            String lcs = "";
            int i = 0, j = 0;
            while (i < m && j < n) {
                if (one.charAt(i) == two.charAt(j)) {
                    lcs += one.charAt(i);
                    i++;
                    j++;
                } else if (opt[i + 1][j] >= opt[i][j + 1]) i++;
                else j++;
            }
            return lcs;
        }

            //String seq1 = "";
            //String seq2 = "";
//            int lengthOne = one.length()-1;
//            int lengthTwo = two.length()-1;
//            int i = lengthOne;
//            while (lengthOne != lengthTwo) {
//                    if (one.charAt(lengthOne) == two.charAt(lengthTwo)) {
//                       String seq1 = one;
//                       String seq2 = two.substring(0, lengthTwo -2);
//                        return longestComSeq(seq1, seq2);
//                    }
//                    String seq1 = one.substring(0, i) + one.substring(i + 1, lengthOne);
//                    String seq2 = two.substring(0, lengthTwo - i);
//                    return longestComSeq(seq1, seq2);
//
//                }
//            return null;
//            }

        }


