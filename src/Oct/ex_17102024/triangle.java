package Oct.ex_17102024;
import java.util.Scanner;
public class triangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sides of triangle");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        if(a==b && b==c ){
            System.out.println("Equilateral triangle");
        }
        else if(a==b || b==c|| c==a){
            System.out.println("Isosceles triangle");
        }
        else {
            System.out.println("Scalene triangle");
        }
    }
}
