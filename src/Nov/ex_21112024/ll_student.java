package Nov.ex_21112024;

import java.util.ArrayList;
import java.util.List;

public class ll_student {
    public static void main(String[] args) {
        Student s=new Student("trish", "1");
        Student s1=new Student("adc", "4");

        Student s2=new Student("trish", "3");

        Student s3=new Student("fwe", "8");
        List<Student> l=new ArrayList<>();
        l.add(s);
        l.add(s1);
        l.add(s2);
        l.add(s3);
        s.print();
        s1.print();
        s2.print();
        s3.print();

    }
}
