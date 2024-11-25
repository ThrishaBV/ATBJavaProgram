package Nov.ex_21112024;

import javax.swing.table.TableRowSorter;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class set {
    public static void main(String[] args) {
        HashSet hs=new HashSet<>();
        hs.add("abc");
        hs.add("apple");
        hs.add("mango");
        System.out.println("hash set");
        System.out.println(hs);
        LinkedHashSet lh=new LinkedHashSet();
        lh.add("trisha");
        lh.add("akhil");
        lh.add("bhoomi");
        System.out.println("linked hash set");
        System.out.println(lh);


    }
}
