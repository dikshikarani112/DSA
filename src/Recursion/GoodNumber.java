package Recursion;

public class GoodNumber {
    private static final long MOD = 1000000007L;
    private static int countGoodNumber(long n) {
        long even = (n+1)/2;
        long odd = n%2;

        long ans  = (power(5, even) * power(4, odd) )% MOD;
        return (int )ans;
    }

    private static long power(int i, long even) {
        long result = 1;
        if (even == 0) {return 1;}
        if (even == 1) { return i;}

       // long res = power(i, even-1) % MOD;
        long half = power(2, even/2) % MOD;
        long res = (half * half) % MOD;
        if (even % 2 == 1) {
            res = (res * i) % MOD;
        }
        return res;

    }


    static void main() {
        //long n = 1;
        long n = 20000000000L;
        System.out.println(countGoodNumber(n));

    }


}
