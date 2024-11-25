package Nov.ex_21112024;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.add("dh");
        s.add("yadsd");
        s.add("sjs");
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.size());
        s.push("jjkj");
        s.add(1,"dhwrf");
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.get(2));
    }
}
