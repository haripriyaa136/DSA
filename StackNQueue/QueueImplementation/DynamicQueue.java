public class DynamicQueue extends CircularQueue{
    protected  int[] data;
    protected  int size=0;
    protected int front=0;
    protected int end=0;
    private static final int DEFAULT_SIZE=10;
    DynamicQueue(){
        //this will call the below constructor with default size.
        this(DEFAULT_SIZE);
    }
    DynamicQueue(int size){
        data = new int[size];
    }
    @Override
    public boolean insert(int item){
        if(isFull()){
            int temp[]=new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[(front+i)%data.length];

            }
            front=0;
            end=data.length;
            return true;
        }
        return super.insert(item);

    }

}
