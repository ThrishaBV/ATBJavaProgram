package Nov.ex_21112024;

import java.util.PriorityQueue;

public class queue {
    public static void main(String[] args) {
        PriorityQueue  q=new PriorityQueue();
        q.offer(2);
        q.offer(4);
        q.offer(0);
        System.out.println(q.peek());
    }
}
