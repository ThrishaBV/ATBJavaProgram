package Nov.ex_12112024.real;

public class real_main {
    public static void main(String[] args) {
child c=new child();
c.loan50();
c.loan25();
    }
}
class child extends Father{
    @Override
    void loan50() {
        System.out.println("child is Giving 50k");
    }
}
abstract class Father{
    abstract void loan50();
    void loan25(){
        System.out.println("25k paid");
    }
}
