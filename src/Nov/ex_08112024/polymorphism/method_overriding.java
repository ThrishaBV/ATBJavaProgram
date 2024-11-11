package Nov.ex_08112024.polymorphism;

public class method_overriding {
    public static void main(String[] args) {
        hound h=new hound();
        h.bark();
    }
}
class Dog{
    void bark(){
        System.out.println("barking");
    }
}
class hound{
    void bark(){
        System.out.println("hound bark");
    }
}
