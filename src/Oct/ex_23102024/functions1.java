package Oct.ex_23102024;
import java.util.Scanner;
public class functions1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1.Addition");
        System.out.println("2.Substractiom");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter numbers for addition");
                int a= sc.nextInt();
                int b= sc.nextInt();
                System.out.println("addition of "+a+"and "+b+"-->"+sum(a,b));
                break;
            case 2:
                System.out.println("Enter numbers for Substraction");
                int c= sc.nextInt();
                int d= sc.nextInt();
                System.out.println("Substraction of "+c+"and "+d+"-->"+sub(c,d));
                break;
            case 3:
                System.out.println("Enter numbers for multiplication");
                int e= sc.nextInt();
                int f= sc.nextInt();
                System.out.println("Multiplication of "+e+"and "+f+"-->"+multi(e,f));
                break;
            case 4:
                System.out.println("Enter numbers for Division");
                int g= sc.nextInt();
                int h= sc.nextInt();
                System.out.println("division of "+g+"and "+h+"-->"+div(g,h));
                break;
            default:
                System.out.println("Invalid input");

        }



    }
    //Sum
    static int sum(int x, int y){
        return x+y;
    }
    static int sub(int x,int y){
        return x-y;
    }
    static int multi(int x,int y){
        return x*y;
    }
    static int div(int x,int y){
        return x/y;
    }
}
