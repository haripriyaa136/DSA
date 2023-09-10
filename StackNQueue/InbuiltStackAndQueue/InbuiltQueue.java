import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;
public class InbuiltQueue {
    public static void main(String args[]){
        /*
        Queue is an interface whereas stack is a class. We can't instantiate a queue.
        Stack is implemented using arrays, whereas queue is implemented using linkedlist.

        USAGE:
        When u want to store the ans so far, and when we want to use those results to use later on.
        And in case of BFS to DFS.
        When we want to convert a recursion program to iteration.




         */
        Queue<Integer> queue = new LinkedList<>();
        queue.add(23);
        queue.add(78);
        queue.add(90);
        queue.add(9);
        //peek() function only prints the first element, whereas poll() and remove() functions removes the first element.
        queue.peek();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);

    }



}
