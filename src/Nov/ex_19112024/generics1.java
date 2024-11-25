package Nov.ex_19112024;

public class generics1 {
    public static void main(String[] args) {

temp_sum(2,8);
temp_sum("abc","wh");
    }
    public static  <T>  T temp_sum(T a,T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
