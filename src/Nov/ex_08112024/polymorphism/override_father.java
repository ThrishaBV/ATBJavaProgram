package Nov.ex_08112024.polymorphism;

public class override_father {
    public static void main(String[] args) {
Son s=new Son();
s.home();
Father f=new Father();
f.home();
//dispatch
        Father f2=new Son();
        f2.home();
    }
}
class Father{
    void home(){
        System.out.println(
                "2 bhk"
        );
    }
}
class Son extends Father{
    @Override
    void home(){
        System.out.println("3bhk");
    }
}
