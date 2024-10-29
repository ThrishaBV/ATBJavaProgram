package Oct.ex_29102024;

public class maxansdmin {
    public static void main(String[] args) {
        int[] m={24,65,45,89,12};
        int ma=max(m);
        System.out.println(ma);
        System.out.println(min(m));

    }
    static  int max(int[] m){
        int max=m[0];
        for(int i=0;i<m.length;i++){
            if(m[i]>max){
                max=m[i];
            }
        }
        return max;
    }
    static int min(int[] m){
        int min=m[0];
        for(int i=0;i<m.length;i++){
            if(m[i]<min){
                min=m[i];
            }
        }
        return min;
    }
}
