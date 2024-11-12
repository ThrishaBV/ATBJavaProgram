package Nov.ex_12112024.interface_ex;

public class interface2 {
    public static void main(String[] args) {
test t=new test();
t.f1();
t.f2();
t.f3();
    }
}
class test implements i2{
    @Override
    public void f1() {
        System.out.println("f1");
    }

    @Override
    public void f3() {
        System.out.println("f3");
    }

    @Override
    public void f2() {
        System.out.println("f2");
    }
}
interface i2{
    void f1();
    void  f2();
    void f3();
}
