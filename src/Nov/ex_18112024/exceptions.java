package Nov.ex_18112024;

public class exceptions {

     public static void main(String[] args) {
         try{
             int c=10/0;
             System.out.println(c);
             String s="";
             s.trim();
         }catch (ArithmeticException a){
             System.out.println(a.getMessage());
         }
        finally {
             System.out.println("always executed");
         }

    }
}
