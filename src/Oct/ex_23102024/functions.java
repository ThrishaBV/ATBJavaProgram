package Oct.ex_23102024;

public class functions {
    public static void main(String[] args){
            greet();
        System.out.println(greet_hello());
        int a=age();
        if(a==18) {
            System.out.println("Can vote");
        }
        else {
            System.out.println("cant vote");
        }
        String name="trisha";
        greet_name(name);
        String fn="tgj";
        String ln="has";
        greet_fn_ln(fn,ln);
        int x=sum(2,4);
        System.out.println(x);

    }
    //no para no retuen type
    static void greet(){
        System.out.println("Hi how are yor");
    }
    //no parameters but with return type
    static String greet_hello(){
        System.out.println("hi");
        return "hello";
    }
    static int age(){
        return 12;
    }
    //with parametrs no rt
    static void greet_name(String name){
        System.out.println("Hi "+name);
    }
    static void greet_fn_ln(String fn,String ln){
        System.out.println("hi "+fn+" "+ln);
    }
     //with parameters with return type
    static int sum(int a, int b){
        int c=a+b;
        return c;
    }
}
