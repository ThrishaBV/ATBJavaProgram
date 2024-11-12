package Nov.ex_12112024;

public class Enginw_main {
    public static void main(String[] args) {
wagnor w=new wagnor();
w.drive();
    }
}
 class wagnor extends Engine{
    wagnor(){
        System.out.println("Dc");
    }
    @Override
    void start() {
        System.out.println("starting");
    }

    @Override
    void stop() {
        System.out.println("stopping");
    }
    void drive(){
        start();
        stop();
    }
}
abstract class Engine{
    abstract void start();
    abstract void stop();
}
