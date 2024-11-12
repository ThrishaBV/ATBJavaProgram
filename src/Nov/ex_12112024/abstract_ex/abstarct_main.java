package Nov.ex_12112024.abstract_ex;

public class abstarct_main {
    public static void main(String[] args) {
Child c=new Child();
c.loan30();
    }
}
class Child extends loan{
    @Override
    void loan50() {
        System.out.println("Giving loan");
    }

    @Override
    void loan30() {
        System.out.println("giving loan 30k");
    }
}
abstract class loan{
    abstract void loan50();
    abstract void loan30();
}
