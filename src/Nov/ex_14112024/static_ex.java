package Nov.ex_14112024;

public class static_ex {
    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        System.out.println(Student.n);
    }
}
class Student{
    int age;//non static\
    static String n="ABC";

    {
        System.out.println("ahdsh");
        System.out.println("abcd");
        System.out.println("Hi");
    }
}
