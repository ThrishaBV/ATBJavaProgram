package Nov.ex_21112024;

public class Student {
    private String name;
    private String roll;
    Student(String n, String r){
        this.name=n;
        this.roll=r;
    }

    public String getName() {
        return name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }
    void print(){
        System.out.println(name +" Roll "+ roll);
    }
}
