package Oct.ex_29102024;
import java.util.Arrays;
import java.util.Scanner;

public class binaryseach {
    public static void main(String[] args){
       /* int[] a={12,23,45,13,9,78};
        Arrays.sort(a);
        System.out.println(a);
        int s=9;
        int i=Arrays.binarySearch(a,s);
        System.out.println(i);*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenght of array");
        int l=sc.nextInt();
        int[] ar = new int[l];
        for(int i=0;i<l;i++){
            System.out.println("Enter numbers");
            ar[i]=sc.nextInt();
        }
        for(int j=0;j<l;j++) {
            System.out.println(ar[j]);
        }
        Arrays.sort(ar);
        System.out.println("Enter number to be searched");
        int s=sc.nextInt();
        System.out.println(Arrays.binarySearch(ar,s));


    }
}
