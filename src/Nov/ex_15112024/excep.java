package Nov.ex_15112024;

public class excep {
    public static void main(String[] args) {
        int a=0;
        try{
        int b=10/a;}
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("dc");
    }
}
