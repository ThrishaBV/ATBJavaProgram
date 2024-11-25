package Nov.ex_20112024;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class nestedlinkedlist {
    public static void main(String[] args) {
        List f=new ArrayList();
        f.add("apple");
        f.add("mango");
        f.add("orange");
        f.add("watermelon");
        System.out.println(f);




List v=new ArrayList();
        v.add("tomato");
        v.add("potato");
        f.add("abc");
        f.add("cucumber");
        System.out.println(v);
        List a=new ArrayList();
        a.add(f);
        a.add(v);
        Iterator i= a.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }







    }
}
