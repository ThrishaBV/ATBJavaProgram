package Oct.ex_18102024;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r;
        System.out.println("Enter number 1");
        int n1= sc.nextInt();
        System.out.println("Enter number 2");
        int n2= sc.nextInt();
        System.out.println("Enter the operator");
        char o=sc.next().charAt(0);
        switch (o){
            case '+': r=n1+n2;
                System.out.println("Addition -> "+r);
                break;
            case '-':r=n1-n2;
                System.out.println("Substraction -> "+r);
                break;
            case '*':r=n1*n2;
                System.out.println("Multiplication -> "+r);
                break;
            case '/':r=n1/n2;
                System.out.println("Division -> "+r);
                break;
            case '%':r=n1%n2;
                System.out.println("Modulus -> "+r);
                break;
            default:
                System.out.println("Invalid ");

        }

    }
}
