package Oct.ex_25102024;

public class string_creation {
    public static void main(String[] args) {
        String n1="trisha";
        System.out.println(n1);
        String s=new String("trisha");
        String s1=new String("trisha");
        System.out.println(s==s1);
        System.out.println(s);
        String n="abcs";
        String n2="abcs";
        System.out.println(n1==s);
        System.out.println(n1==n2);
        System.out.println(s.equals(s1));
        System.out.println(s.equals(n1));
    }
}
