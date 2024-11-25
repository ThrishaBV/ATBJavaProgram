package Nov.ex_20112024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list {
    public  static void main(String[] args) {
        List l=new ArrayList();
        l.add(1);
        l.add(2);
        l.add("sdb");
        l.add("sdkc");
        l.add(89.09);
        Iterator it = l.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
