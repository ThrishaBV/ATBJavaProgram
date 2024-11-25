package Nov.ex_22112024;

public class maxthree extends generics{
    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        T max=a;
        if(b.compareTo(c)>0){
            return b;
        }
        if(c.compareTo(b)>0){
            return c;
        }
        else{
            return max;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(1,8,6));
        System.out.println(max("ad","sud","sjd"));
    }
}
