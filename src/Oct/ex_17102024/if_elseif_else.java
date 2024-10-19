package Oct.ex_17102024;
import java.util.Scanner;
public class if_elseif_else {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks");
        int m= sc.nextInt();
        if(m>=90 && m<=100){
            System.out.println("Grade A");
        }
        else if (m>=80) {
            System.out.println("Grade B");
        }
        else if (m>=79) {
            System.out.println("Grade C");
        }
        else if (m>=69) {
            System.out.println("Grade D");
        } else if (m<=0 || m>100) {
            System.out.println("LOL");
        } else {
            System.out.println("Grade F");
        }

    }
}
