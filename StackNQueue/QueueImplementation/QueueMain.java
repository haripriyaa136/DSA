public class QueueMain {
    public static void main(String args[]) throws Exception{
        System.out.println("Custom Queue");
       CustomQueue cq = new CustomQueue();
            cq.insert(89);
            cq.insert(90);
            cq.insert(91);
            cq.insert(92);
            cq.insert(93);
            cq.display();
            System.out.println(cq.remove());
            cq.display();
            System.out.println(cq.Front());

       // Removing an element from queue takes O(n) time. So we use circular queue.
        System.out.println("Circular Queue");
        CircularQueue c = new CircularQueue(5);
            c.insert(89);
            c.insert(90);
            c.insert(91);
            c.insert(90);
            c.insert(91);
            c.display();
            System.out.println(c.remove());
            c.display();
            c.insert(99);
            c.display();

            System.out.println("Dynamic Circular Queue");
            DynamicQueue dq = new DynamicQueue(5);
            dq.insert(67);
            dq.insert(90);
            dq.insert(68);
            dq.insert(69);
            dq.insert(45);
            dq.insert(88);
            dq.insert(77);
            dq.display();
            System.out.println(dq.remove());
            dq.display();



    }
}
