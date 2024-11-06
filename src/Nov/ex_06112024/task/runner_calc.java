package Nov.ex_06112024.task;

import java.util.Scanner;

public class runner_calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number a");
        int a=sc.nextInt();
        System.out.println("enter number b");
        int b=sc.nextInt();
        calculation ad=new calculation(a,b);
        System.out.println("Addition -->"+ad.add());
        System.out.println("Enter num for sub");
        int c=sc.nextInt();
        System.out.println("enter number for sub");
        int d=sc.nextInt();
        calculation su=new calculation(c,d);
        System.out.println(su.sub());
calculation de=new calculation(a);
de.display();
    }
}
