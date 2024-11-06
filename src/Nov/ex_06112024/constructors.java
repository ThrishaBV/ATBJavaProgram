package Nov.ex_06112024;

import java.util.Scanner;

public class constructors {
    public static void main(String[] args) {
        Car1 c=new Car1("tesla",2024);
        System.out.println(c.model);
        System.out.println(c.year);
c.display();
        Car1 c1=new Car1("nano",2015);
        System.out.println(c1.year);
c1.display();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter model  ");
        String m=sc.next();
        System.out.println("Enter year  ");
        int y=sc.nextInt();
        Car1 c2=new Car1(m,y);
        System.out.println(c2.year);
        System.out.println(c2.model);
c2.display();
    }
}
class Car1{
    String model;
    int year;
    Car1(String model, int year){
        System.out.println("PC");
        this.model=model;
        this.year=year;
    }
    void display(){
        System.out.println("Details model "+model+ " year --> "+year);
    }

}
