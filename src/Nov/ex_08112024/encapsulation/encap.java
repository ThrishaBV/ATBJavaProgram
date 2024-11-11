package Nov.ex_08112024.encapsulation;

public class encap {
    public static void main(String[] args) {
        VWOlogin v=new VWOlogin("goodadmin","password");
        System.out.println(v.pass);
    }
}
class VWOlogin{
    String username;
    String pass;
    VWOlogin(String u,String p){
        this.username=u;
        this.pass=p;
    }
}

class goodVWOlogin{
    private String str;
    private String pass;
    goodVWOlogin(String s, String p){
        this.str=s;
        this.pass=p;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
