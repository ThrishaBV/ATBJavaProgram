package Nov.ex_11112024.Real1;

public class tc1 extends baseclass1 {
    tc1(){
        super();
        System.out.println("DC-tc1");
    }
    public void starttest(){
        openbrowser("chrome");
        closebrowser();
    }

    @Override
    public void setBrowser(String browser, boolean auth) {
        System.out.println("Own logic");
        super.setBrowser("edge",false);

    }


}
