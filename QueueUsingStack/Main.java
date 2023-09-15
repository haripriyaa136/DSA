// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        QueueUsingStackInsertEfficient q = new QueueUsingStackInsertEfficient();
        q.push(8);
        q.push(6);
        q.push(9);
        q.push(0);
        q.peek();
        q.pop();
        System.out.println(q.empty());

        QueueUsingStackRemoveEfficient qw = new QueueUsingStackRemoveEfficient();
        qw.push(2);
        qw.push(8);
        qw.push(9);
        System.out.println(qw.peek());
        qw.pop();
        System.out.println(qw.empty());

    }
}