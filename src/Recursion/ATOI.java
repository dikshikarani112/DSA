package Recursion;

public class ATOI {

    static final int INT_MIN_VAL = -2147483648;
    static final int INT_MAX_VAL = 2147483647;

    static private int myAtoi(String s) {

        int i = 0;

        // Skip leading spaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Handle sign
        int sign = 1;

        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        return helper(s, i, 0, sign);
    }

    static private int helper(String s, int i, long num, int sign) {

        // Stop when we reach a non-digit
        if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
            return (int) (sign * num);
        }

        int digit = s.charAt(i) - '0';

        num = num * 10 + digit;

        // Handle overflow
        if (sign * num <= INT_MIN_VAL) {
            return INT_MIN_VAL;
        }

        if (sign * num >= INT_MAX_VAL) {
            return INT_MAX_VAL;
        }

        return helper(s, i + 1, num, sign);
    }

    public static void main(String[] args) {

        String s = "   -12345";

        System.out.println(myAtoi(s));
    }
}