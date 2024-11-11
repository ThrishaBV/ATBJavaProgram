package Nov.ex_11112024.Real;

public class testcase1 extends baseclass{
    testcase1(){
        super();
        System.out.println("DC-t1");
    }

    /*public void startTestcase1(){
        openbrowser("chrome");
        closebrowser();
    }*/
    @Override
    public void setBrowser(String browser,boolean auth) {
        System.out.println("own logic");
        super.setBrowser(browser,auth);
    }

}
