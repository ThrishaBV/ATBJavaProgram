package Oct.ex_22102024.task;
import java.util.Scanner;
public class reverse_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int rev=0;
        for(;num!=0;){
           int r=num%10;
           rev=rev*10+r;
           num=num/10;
        }
        System.out.println(rev);
    }
}
