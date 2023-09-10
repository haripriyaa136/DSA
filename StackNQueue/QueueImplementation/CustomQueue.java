public class CustomQueue {
    protected  int[] data;
    private  int end=0;
    private static final int DEFAULT_SIZE=10;
    CustomQueue(){
        //this will call the below constructor with default size.
        this(DEFAULT_SIZE);
    }
    CustomQueue(int size){
        data = new int[size];
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        return true;
    }
    // removal of an element in custom queue takes O(n).
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed=data[0];
        //Shift the elements to left
        for(int i=0;i<data.length-1;i++){
            data[i]=data[i+1];
        }
        end--;
        return removed;

    }
    public int Front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[0];

    }
    public void display(){
        for(int i=0;i<end;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("END");
    }

    public boolean isFull(){
        if(end==data.length){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(end==0){
            return true;
        }
        return false;
    }

}
