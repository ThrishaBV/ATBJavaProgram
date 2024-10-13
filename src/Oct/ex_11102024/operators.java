package Oct.ex_11102024;

public class operators {
    public static void main(String[] args){
        //Assignment operator
        int a=30;
       int b=5;
       String s1="Thrish";
        String s2="abv";
        //arithmetic operator
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        //relational operator
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a>=b);
        //unary operator
        System.out.println(a=a+1);
        System.out.println(a+b+s1+s2);
        System.out.println(s1+s2+a+b);
        //Logical operator
        boolean x=!(a>b)&&(b>10);
        System.out.println(x);
        boolean w=(a==b)||(b>a);
        System.out.println(w);
    }
}
