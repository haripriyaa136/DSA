public class CircularQueue {
    protected  int[] data;
    protected  int size=0;
    protected int front=0;
    protected int end=0;
    private static final int DEFAULT_SIZE=10;
    CircularQueue(){
        //this will call the below constructor with default size.
        this(DEFAULT_SIZE);
    }
    CircularQueue(int size){
        data = new int[size];
    }
    public boolean isFull(){
        if(size==data.length){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }

    public boolean insert(int item) {
        if(isFull()){
            System.out.println("Queue is full!!!");
            return false;
        }
       data[end++]=item;
       end=end%data.length;
       size++;
       return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
           throw new Exception("Queue is Empty!!!");
        }
        int removed=data[front++];
        front=front%data.length;
        size--;
        return removed;
    }
    public void display(){
      /*
       // The below code will not work once the queue got filled and we try to print.In that case front and end both will be 0, so it won't print anything.

       for(int i=front;i<end;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("END");

       */
        int i=front;
        do{
          System.out.print(data[i++]+"->");
          i=i%data.length;
        }while(i!=end);
        System.out.println("END");
    }


}
