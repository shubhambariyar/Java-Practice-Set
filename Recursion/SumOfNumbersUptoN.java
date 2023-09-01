package Recursion;

public class SumOfNumbersUptoN {
    public static void sumLogic(int n, int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sumLogic(n-1,sum+n);
    }

    public static void main(String[] args) {
        sumLogic(8,0);
    }
}
