package Oct.ex_17102024;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=1;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }
            else if (i%3==0) {
                System.out.println("Fizz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
