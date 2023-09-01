import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args){
        int n,a=0,b=1,sum=0;
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter no of terms you want in series:");
        n=sc.nextInt();
        while(n!=0){
            System.out.println(a);
            sum=a+b;
            a=b;
            b=sum;
            n--;
        }

    }
}
