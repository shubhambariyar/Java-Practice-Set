package Recursion;

public class Factorial {

    public static void fact(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        fact(n-1,sum*n);
    }

    public static void main(String[] args) {
        fact(5,1);
    }
}
