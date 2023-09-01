package Recursion;

public class fibonacciSeries {

    public static void fib(int a, int b, int sum, int n) {
        if (n == 0) {
            return;
        }
        System.out.println(sum);
        a = b;
        b = sum;
        fib(a, b, a + b, n - 1);
        }

    public static void main(String[] args)
        {
        fib(0,1,0,8);
    }
}
