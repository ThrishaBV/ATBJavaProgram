package November.ex_04112024;

import java.util.Scanner;

public class righttri {
     public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
        for(int i = s;i>=0 ;i--)
    {
        for (int j = 0; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

}
