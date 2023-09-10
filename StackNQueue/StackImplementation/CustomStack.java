public class CustomStack {
    protected  int[] data;
    private  int ptr=-1;
   // If u removed the static keyword in the below declaration you will get this error "Cannot reference 'CustomStack.DEFAULT_SIZE' before supertype constructor has been called".
    // bcz,if it is not static then the default size variable will be instance variable tied to each instance of the CustomStack class.
    /*
    With static (class-level constant):
        DEFAULT_SIZE is initialized when the class is loaded.
        The superclass constructor (CustomStack()) can safely reference CustomStack.DEFAULT_SIZE because it's a constant, and its value is known at compile time.
    Without static (instance variable):
        DEFAULT_SIZE is an instance variable, and it's initialized when an instance of the class is created.
        The superclass constructor (CustomStack()) cannot reference CustomStack.DEFAULT_SIZE because the instance hasn't been fully initialized yet.
     */
    private static final int DEFAULT_SIZE=10;
    CustomStack(){
        //this will call the below constructor with default size.
        this(DEFAULT_SIZE);
    }
    CustomStack(int size){
        data = new int[size];
    }
    public  boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full!!!");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack!!!");
        }
//        int removed =data[ptr];
//        ptr--;
//        return removed;
        // We don't need to remove or make the element to zero, because while adding a new element it will be automatically removed.
        return data[ptr--];
    }
    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack!!!");
        }
        return data[ptr];
    }
    public boolean isFull(){
        if(ptr==data.length-1){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(ptr==-1){
            return true;
        }
        return false;
    }
}
