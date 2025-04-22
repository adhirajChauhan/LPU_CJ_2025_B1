//Dequeue - Double Ended queue - we can insert and remove elements from both ends - front and rear

import java.util.ArrayDeque;
import java.util.Deque;

public class collections_4 {
    public static void main(String[] args) {

        Deque<String> dq = new ArrayDeque<>();

        //add
        dq.addFirst("A");
        dq.addLast("B");
        dq.addLast("C");
        //output = A <- B <- C

        //remove
        // dq.removeFirst(); //-> removes A
        // dq.removeLast(); //-> removes C

        //peek
        // dq.peekFirst(); // -> A
        // dq.peekLast(); // -> C


    }
}
