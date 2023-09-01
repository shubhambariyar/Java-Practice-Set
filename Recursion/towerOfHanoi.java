package Recursion;

public class towerOfHanoi {
    public static void TOHLogic(int n,String s,String h,String d) {
        if(n==1){
            System.out.println("Shift plate "+n+" from "+s+" to "+d);
            return;
        }
        TOHLogic(n-1,s,d,h);
        System.out.println("Shift plate "+n+" from "+s+" to "+d);
        TOHLogic(n-1,h,s,d);
    }

    public static void main(String[] args) {
        int n=3;
        TOHLogic(n,"Source","Helper","Destination");
    }
}
