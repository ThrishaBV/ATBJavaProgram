package Nov.ex_12112024;

public class car extends vehicle{
    private int max=200;
    car() {
        super();
        System.out.println("DC");
        System.out.println(super.maxspeed);
        System.out.println(this.max);
    }

    @Override
    public void display() {
        System.out.println("Child");
        super.display();
    }
}
