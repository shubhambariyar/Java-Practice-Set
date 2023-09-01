package Recursion;

public class ReverseAString {
    public static void reverseLogic(String str,String rev, int idx) {
        if(idx==0){
            rev=rev+str.charAt(idx);
            System.out.println(rev);
            return;
        }
        reverseLogic(str,rev+str.charAt(idx),idx-1);
        }


    public static void main(String[] args) {
        String str="abcdef";
        reverseLogic(str,"",str.length()-1);
    }
}
