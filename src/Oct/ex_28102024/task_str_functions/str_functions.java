package Oct.ex_28102024.task_str_functions;

public class str_functions {
    public static void main(String[] args) {
        String str="thrisha";
        System.out.println(str.substring(2,5));
        int l=str.length();
        System.out.println(str.toUpperCase());
        System.out.println(str.contains("ri"));
        String s2="dfeu";
        System.out.println(str.concat(s2));
        System.out.println(s2.toUpperCase());
        System.out.println(str.startsWith("th"));
        System.out.println(str.startsWith("shx"));
        System.out.println(str.endsWith("a"));
        String c="abc,fcv,ytf,gv";
        String[] f=c.split(",");
        System.out.println(f[1]);
        System.out.println(f[6]);
        System.out.println(s2.replace("f","a"));
        System.out.println(s2.charAt(2));
        String s=" fhc ";
        System.out.println(s.trim());

        StringBuilder s1=new StringBuilder("jhv");
        System.out.println(s1.append(" ytyt"));
        System.out.println(s1.reverse());
        System.out.println(s1.replace(2,5,"sgjs"));
        System.out.println(s1.delete(3,5));


    }
}
