package Oct.ex_18102024;
import java.util.Scanner;
public class switch2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Enter browser");
        String b=sc.nextLine();
        switch (b){
            case "chrome":
                System.out.println("Chrome browser");
                break;
            case "firefox":
                System.out.println("firefox browser");
                break;
            case "edge":
                System.out.println("edge browser");
                break;
            default:
                System.out.println("Dont know");
        }*/
        char a='C';
        switch (a){
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            default:
                System.out.println("invalid");

        }
    }
}
