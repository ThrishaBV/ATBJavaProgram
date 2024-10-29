package Oct.ex_29102024;

import java.util.Arrays;

public class arrays1 {
    public static void main(String[] args) {
        int[] m={23,56,78,12,45};
        Arrays.sort(m);
        for(int i=0;i<m.length;i++){
            System.out.println(m[i]);
        }
        int index=Arrays.binarySearch(m,12);
        System.out.println(index);
    }
}
