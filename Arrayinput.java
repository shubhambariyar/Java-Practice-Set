import java.util.*;
public class Arrayinput
{
    public static void main(String[] args)
    {
        int n;

        System.out.println("enter no of entries:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[] a = new int[n];
        int i;
        for(i=0; i<n; i++)
        {
            System.out.println("enter entry number "+i+":");
            a[i]=sc.nextInt();

        }

        System.out.println("Array:");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }

}

