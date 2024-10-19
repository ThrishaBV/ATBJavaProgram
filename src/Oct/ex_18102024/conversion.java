package Oct.ex_18102024;
import java.util.Scanner;
public class conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        int ch= sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("You have opted kilometer to meter conversion");
                System.out.println("Enter kilometer");
                float k= sc.nextFloat();
                double miles;
                miles=k*0.621;
                System.out.println("Miles" +miles);
                break;
            case 2:
                System.out.println("You have opted for Fahrenheit to Celsius  conversion");
                System.out.println("Enter Fahrenheit");
                double Celsius = sc.nextDouble();
                double fahrenheit = (Celsius * 9/5) + 32;
                System.out.println("Fahrenheit "+fahrenheit);
                break;
            default:
                System.out.printf("Inavlid choice");
        }
    }
}
