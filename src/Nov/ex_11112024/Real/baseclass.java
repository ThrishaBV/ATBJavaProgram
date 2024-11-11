package Nov.ex_11112024.Real;

public class baseclass {
    private String browser;
    baseclass(){
        System.out.println("DC");
    }
    baseclass(String b){
        this.browser=b;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean auth) {
        if(auth){
        this.browser = browser;}
        else{
            System.out.println("no");
        }
    }
    void  openbrowser(){
        System.out.println("open browser");
    }
    void openbrowser(String bb){
        System.out.println(bb);
    }
    void  closebrowser(){
        System.out.println("close browser");
    }
}
