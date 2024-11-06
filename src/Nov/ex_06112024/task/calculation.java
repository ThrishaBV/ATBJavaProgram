package Nov.ex_06112024.task;

public class calculation {
    int a;
    int b;
    int d;
    calculation(int a,int b){
        this.a=a;
        this.b=b;
    }
    calculation(int d){
        this.d=d;
    }
    int add(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
    void display(){
        System.out.println(d);
    }
}
