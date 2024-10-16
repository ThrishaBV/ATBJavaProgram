package Oct.ex_16102024;
import java.util.Scanner;
public class scannerclass {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
   System.out.println("Enter name 1");
    String n1=sc.nextLine();
   System.out.println("Enter age 1");
    int a1=sc.nextInt();
    System.out.println("Enter salary 1");
    int s1=sc.nextInt();

    System.out.println("Enter name 2");
    String n2=sc.nextLine();
   System.out.println("Enter age 2");
    int a2=sc.nextInt();
    System.out.println("Enter salary 2");
   int s2=sc.nextInt();

    System.out.printf("Name 1: %s" +
            "Age 1 : %d" +
            "Salary 1 : %d", n1,a1,s1);
    System.out.println();
    System.out.printf("Name 2: %s" +
            "Age 2 : %d" +
            "Salary 2 : %d", n2,a2,s2);
    System.out.println();

    int max=(s1>s2)?s1:s2;
    System.out.println(max);

}
}
