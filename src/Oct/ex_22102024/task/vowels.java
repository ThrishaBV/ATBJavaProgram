package Oct.ex_22102024.task;
import java.util.Scanner;
public class vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=0;
        int c=0;
        System.out.println("Enter string");
        String s= sc.next();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                v++;
            }
            else{
                c++;
            }

        }
        System.out.println("Vowels "+v);
        System.out.println("Consonants "+c);
    }
}
