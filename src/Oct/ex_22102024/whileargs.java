package Oct.ex_22102024;

public class whileargs {
    public static void main(String[] args) {
        String ar_age=args[0];
        int age=Integer.parseInt(ar_age);
        while(age>=1){
            System.out.println("age is "+age);
            age--;
        }
    }
}
