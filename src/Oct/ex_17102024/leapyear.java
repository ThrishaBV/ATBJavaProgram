package Oct.ex_17102024;
import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        System.out.println("Enter year");
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        if((y%4==0)&&(y%100!=0) || (y%400==0)){
            System.out.println("Leap year");

        }else{
            System.out.println("Not leap year");
        }
    }
}
