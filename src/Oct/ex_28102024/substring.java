package Oct.ex_28102024;
import java.lang.String;
public class substring {
    public static void main(String[] args) {
        String str="gshdm bhsekfcan ";
        System.out.println(str.substring(3,9));
        /*concatination
        String s1="trisha ";
        String s2="akhil";
        System.out.println(s1.concat(s2));
        System.out.println(s1.charAt(4));
        System.out.println(str+s1+s2);
        String s="ehfdfr  ";
        System.out.println(s.trim());
        System.out.println(s.indexOf('f'));
        System.out.println(s.contains("fd"));
        System.out.println(s.contains("sdf"));
        System.out.println(s.replace('h','a'));
        /*spil
        String f="apple,banana,Orange";
        String[] s_f=f.split(",");
        String a="abc||adkn||hwqs";
        String[] a1=a.split("|");
        System.out.println(s_f[1]);
        System.out.println(s_f[0]);
        System.out.println(s_f[2]);
        System.out.println(a1[0]);*/
        String a="trisha12 akil098";
        System.out.println(a.endsWith("il"));
        System.out.println(a.startsWith("tr"));
        System.out.println(a.startsWith("du"));
        System.out.println(a.replaceAll("\\d+","||"));


    }
}

