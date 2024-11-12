package Nov.ex_12112024.interface_ex;

public class main_interface {
    public static void main(String[] args) {

    }
}
abstract class fun{
    fun(){

    }
    abstract void abc();
    abstract void sdf();
    void dis(){
        System.out.println("dis method");
    }
}
interface i{
    void absd();
    void asd();
    default void meth(){
        System.out.println("Default mrthod in interfaceccc");
    }
}
