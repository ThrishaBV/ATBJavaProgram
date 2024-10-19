package Oct.ex_18102024;
import java.util.Scanner;
public class year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number from 1 to 12,,, i will tell month");
        int n=sc.nextInt();
        switch (n){
            case 1:
                System.out.println("1: January");
                break;
            case 2:
                System.out.println("2: Febrauary");
                break;
            case 3:
                System.out.println("3: March");
                break;
            case 4:
                System.out.println("4: April");
                break;
            case 5:
                System.out.println("5: May");
                break;
            case 6:
                System.out.println("6: June");
                break;
            case 7:
                System.out.println("7: July");
                break;
            case 8:
                System.out.println("8: August");
                break;
            case 9:
                System.out.println("9: September");
                break;
            case 10:
                System.out.println("10: October");
                break;
            case 11:
                System.out.println("11: November");
                break;
            case 12:
                System.out.println("12: December");
                break;
            default:
                System.out.println("invalid number");
        }
    }
}
