package Nov.ex_05112024.task;

public class Runnerclass {
    public static void main(String[] args) {

            Dog1 d1=new Dog1();
            d1.name="tommy";
            d1.breed="Bulldog";
            d1.food="nonveg";
            d1.age=2;
            d1.sleep();
            d1.eat(d1.food);
            d1.getdetails(d1.name, d1.breed, d1.age);

            Dog1 d2=new Dog1();
        d2.name="jax";
        d2.breed="poodle";
        d2.food="milk";
        d2.age=1;
        d2.sleep();
        d2.eat(d2.food);
        d2.getdetails(d2.name, d2.breed, d2.age);

        Dog1 d=new Dog1();
        d.name="tommy";
        d.breed="Bulldog";
        d.food="nonveg";
        d.age=2;
        d.sleep();
        d.eat(d.food);
        d.getdetails(d.name, d.breed, d.age);
        Dog1 d3=new Dog1();
        d3.name="tommy";
        d3.breed="Bulldog";
        d3.food="nonveg";
        d3.age=2;
        d3.sleep();
        d3.eat(d3.food);
        d3.getdetails(d3.name, d3.breed, d3.age);
    }
}
