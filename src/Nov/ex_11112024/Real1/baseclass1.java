package Nov.ex_11112024.Real1;

public class baseclass1 {
    private String browser;

    baseclass1() {
        System.out.println("DC");
    }

    baseclass1(String b) {
        this.browser = b;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean auth) {
        if (auth) {
            this.browser = browser;
        } else {
            System.out.println("not setting");
        }
    }
    void openbrowser(String bb){
        System.out.println("Open browser--> "+bb);
    }
    void closebrowser(){
        System.out.println("Close browser");
    }

}