import java.util.*;
public class InBuiltExamples {
    public static void main(String args[]){
        // Inbuilt stack in java
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(32);
        stk.push(67);
        stk.push(90);
        stk.push(89);
        stk.push(45);
        System.out.println("Printing stack");
        System.out.println(stk);

        System.out.println("poping elements");
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());

        //If we tried to remove element when the stack is empty, it will throw an exception => Empty Stack Exception.

    }
}
