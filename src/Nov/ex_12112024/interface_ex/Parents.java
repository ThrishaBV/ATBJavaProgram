package Nov.ex_12112024.interface_ex;

public class Parents {
    public static void main(String[] args) {
        child c=new child();
        c.f1();
        c.m2();
        c.same();
    }
}
class child implements father,mother{
    @Override
    public void same() {
        System.out.println("same");
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }

    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void f2() {
        System.out.println("f2");
    }

    @Override
    public void f1() {
        System.out.println("f1");
    }
}
interface father{
    void f1();
    void f2();
    void same();
}
interface mother{
    void m1();
    void m2();
    void same();
}