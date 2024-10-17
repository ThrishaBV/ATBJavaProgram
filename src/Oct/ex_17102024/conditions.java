package Oct.ex_17102024;
import java.util.Scanner;
public class conditions {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       /* System.out.println("Enter age");
        int age= sc.nextInt();
        if(age>18){
            System.out.println("Yes can vote "+age);
        }
        else{
            System.out.println("Cannot vote");
        }
        boolean a=true;
        a=!a;
        if(2+2<4){
            System.out.println("inside");
        }
        else{
            System.out.println("outside "+a);
        }*/
        System.out.println("Enter number");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        sc.close();
    }
}
