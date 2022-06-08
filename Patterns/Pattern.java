public class Pattern {
    public static void main(String[] args) {
        //call functions with parameters
    }
    static void q1(int n)
    {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void q2(int n)
    {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
               System.out.print("*");
            }
            System.out.println();
        }
    }
    static void q3(int n)
    {
        for (int row = n; row >= 1; row--) {
            for (int col = row; col >= 1 ; col--) {
               System.out.print("*");
            }
            System.out.println();
        }
    }
    static void q5(int n)
    {
        for (int row = 1; row < 2*n; row++) {
            int totCol = (row > n) ? 2*n - row : row;
            for (int col = 1; col <= totCol  ; col++) {
               System.out.print("*");
            }
            System.out.println();
        }
    }
    static void q6(int n)
    {
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for (int space = 1; space <= spaces  ; space++) {
               System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void q8(int n)
    {
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for (int space = 1; space <= spaces  ; space++) {
               System.out.print(" ");
            }
            int totCol = 2*row-1;
            for (int col = 1; col <= totCol; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void q18(int n)
    {
        for (int row = 1; row <= n; row++) {
            for (int col1 = n; col1 >= row; col1--) {
                System.out.print("*");
            }
            for (int space = 1; space <= 2*row-2; space++) {
                System.out.print(" ");
            }
            for (int col2 = n; col2 >= row; col2--) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col3 = 1; col3 <= row; col3++) {
                    System.out.print("*");
                }
                for (int sp = 2*n-2*row; sp >=1 ; sp--) {
                    System.out.print(" ");
                }
                for (int col4 = 1; col4 <= row; col4++) {
                    System.out.print("*");
                }
                System.out.println();
        }
    }
        static void q31(int n)
        {
            int original = n;
            n = 2*n;
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    int num = original-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                    System.out.print(num +" ");
                }
                System.out.println();
            }
        }
}

