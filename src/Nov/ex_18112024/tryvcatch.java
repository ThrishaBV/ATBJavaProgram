package Nov.ex_18112024;

public class tryvcatch {
    public static void main(String[] args) {
        try {
            String s1 = "shdc";
            String a1 = args[0];
            int a = 10 / 0;
            String t = s1.trim();
        } catch (Exception e) {
            System.out.println("Exception");
        }
        finally {
            System.out.println("finally");
        }

    }
}
