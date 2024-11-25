package Nov.task;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ori=sc.next();
        String rev="";
        for(int i=ori.length()-1;i>=0;i--){
            rev=rev+ori.charAt(i);
        }
        if(ori.equals(rev)){
            System.out.println(rev);
            System.out.println("string is palindrome");
        }
        else{
            System.out.println(rev);
            System.out.println("String is not palindrome");
        }
    }
}
