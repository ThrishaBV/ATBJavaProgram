package Nov.ex_14112024;

public class enum_colors {
    public static void main(String[] args) {

        System.out.println(Color.BLUE.getHexcode());
    }
}
enum Color{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");



    private String hexcode;

    Color(String hexcode){
        this.hexcode = hexcode;
    }

    String getHexcode() {
        return this.hexcode;
    }




}


