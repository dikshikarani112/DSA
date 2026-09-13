package Recursion;

public class Power {
    private static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return x;
        }
        if (n < 0) {
            return 1 / myPow(x, -n);
        }
        double ans = x;
        ans *= myPow(x,n-1);
        return ans;
    }
    static void main(String[] args) {
//        int n = 10;
//        double x = 2.0000;
        int n = -2;
        double x = 2.0000;

        System.out.println(myPow(x,n));
        System.out.printf("%.4f\n", myPow(x,n));
    }



}
