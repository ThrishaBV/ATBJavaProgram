package Oct.ex_28102024;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("trisha");
        sb.append("akhil");
        System.out.println(sb);
        StringBuilder ab1=new StringBuilder("hgws");
        ab1.append("js");
        System.out.println(ab1);
        ab1.insert(2,'h');
        System.out.println(ab1);
    }
}
