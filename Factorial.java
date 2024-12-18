public class Factorial {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("-------------------");
        System.out.println(" Number    Factorial");
        System.out.println("--------------------");

        for (int n = 1; n <= 10; n++){
            System.out.println(" "+ n + "      " + fact(n));
            sum = sum + fact(n);
        }
        System.out.println("------------------");
        System.out.println(" Sum   =   " + sum);
        System.out.println("------------------");
    }

    static int fact(int n) {
        int f = 1;
        for (int i = n; i >= 1; i--) {
            f = f * i;
        }
        return f;
    }
}
