package Nov.ex_15112024;

public class exception_ex1 {
    public static void main(String[] args) {
        System.out.println("Start");
        String s=null;
        try {
            s.trim();
        }catch (Exception e){
            System.out.println("Cant handle");
        }
        System.out.println("End");
    }
}
