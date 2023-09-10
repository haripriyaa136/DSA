public class StackMain {
    public static void main(String args[]) throws StackException{
        System.out.println("Custom Stack!!!");
        CustomStack cstack = new CustomStack(5);
        cstack.push(23);
        cstack.push(29);
        cstack.push(20);
        cstack.push(26);
        cstack.push(24);
        cstack.push(78); // This will say "stack is full" if this is custom stack!
        System.out.println(cstack.pop());
        System.out.println(cstack.pop());
        System.out.println(cstack.pop());
        System.out.println(cstack.pop());
        System.out.println(cstack.pop());
        // System.out.println(cstack.pop()); // This will cause exception.

        System.out.println("Dynamic Stack!!!");

        // CustomStack ds = new DynamicStack(5);
        DynamicStack ds = new DynamicStack(5);
        ds.push(89);
        ds.push(90);
        ds.push(56);
        ds.push(23);
        ds.push(29);
        ds.push(20);
        ds.push(26);
        ds.push(24);
        // Adding additional element will not cause any error!
        System.out.println(ds.pop());
        System.out.println(ds.pop());
        System.out.println(ds.pop());
        System.out.println(ds.pop());
        System.out.println(ds.pop());


    }
}
