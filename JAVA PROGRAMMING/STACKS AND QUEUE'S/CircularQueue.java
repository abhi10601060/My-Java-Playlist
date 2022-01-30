import java.util.Arrays;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=5;
    protected int s=0;
    protected int e=-1;
    private int size;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data=new int[size];
    }

    public void add(int val) throws Exception{
        if(isFull()){
            throw new  Exception("Queue is full...");
        }
        this.e=(e+1)%data.length;
        this.data[e]=val;
        this.size++;



    }
    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is Empty..");
        }
        int n=this.data[s];
        this.data[s]=0;
        s=(s+1)%data.length;
        this.size--;
        return n;
    }

    protected boolean isFull() {
        if((e+1==s && s!=0) ){
            return true;
        }
        if(size==data.length){
            return true;
        }
        return false;
    }
    private boolean isEmpty(){
        if(data[s]==0){
            return true;
        }
        return false;
    }
    public void getEnd(){
        System.out.println(this.data[this.e]);
    }
    public void getStart(){
        System.out.println(this.data[this.s]);
    }
    public void display(){
        System.out.println(Arrays.toString(this.data));
    }
}
