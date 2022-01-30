public class CustomStack {
    private int[] data;
    private static final int DEFAULT_SIZE=10;
    private int size=0;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data=new int [size];
    }
    public void push(int val){
        if (this.size==this.data.length){
            int[]temp=new int[DEFAULT_SIZE*2];
            for (int i = 0; i < this.size; i++) {
                temp[i]=this.data[i];
            }
            this.data=temp;
        }
        this.data[size]=val;
        this.size++;
    }
    public int pop()throws Exception{
        if(isEmpty()){
            throw new Exception("You cant pop from Empty Stack...");
        }
        this.size--;
        int n=this.data[this.size];
        this.data[this.size]=0;
        return n;
    }

    public boolean isEmpty() {
        if(this.size==0){
            return true;
        }
        return false;
    }
    public void peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty...");
        }
        System.out.println(this.data[size-1]);
    }
    public void display(){
        if(isEmpty()){
            System.out.println("["+"]");
        }
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]+",");
        }
        System.out.println("]");
    }

}
