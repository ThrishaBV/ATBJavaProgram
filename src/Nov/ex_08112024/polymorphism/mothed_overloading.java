package Nov.ex_08112024.polymorphism;

public class mothed_overloading {
    public static void main(String[] args) {
     math m=new math();
    float r=m.add(2,4);
        System.out.println(r);
        System.out.println(m.add(2,4,6));

    }
}
class math{
    int add(int a,int b){
        return a+b;
    }
    float add(float a,float b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
