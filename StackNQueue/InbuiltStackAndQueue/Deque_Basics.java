import java.util.ArrayDeque;
import java.util.Deque;
public class Deque_Basics {
    public static void main(String args[]){
        /*
        It's a double ended queue. We can add or remove elements on both the sides.Null element is not allowed.
        No capacity for this.
        We use ArrayDeque in order to create an object.
        This class is likely to be faster than stack when used as a stack.
        And this class is likely faster than LinkedList when used as a queue.
         */
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(67);
        dq.addFirst(89);
        dq.addLast(34);
        dq.removeLast();
        dq.removeFirst();
    }
}
