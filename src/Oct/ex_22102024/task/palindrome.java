package Oct.ex_22102024.task;
import java.util.Locale;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.next().toLowerCase();
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){

            System.out.println("palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}