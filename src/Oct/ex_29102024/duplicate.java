package Oct.ex_29102024;

import java.lang.reflect.Array;

public class duplicate {
    public static void main(String[] args) {
        int[] ar={12,67,90,44,67,54,44};
        int n=Array.getLength(ar);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ar[i]==ar[j]){
                    System.out.println("Duplicate element "+ar[i]);
                }
            }
        }
    }
}
