package Oct.ex_22102024;
import java.util.Scanner;
public class whilescanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        while(age>=1){
            System.out.println(age);
            age--;
        }

    }
}
