public class DynamicCircularQueue extends CircularQueue {
    public DynamicCircularQueue(){
        super();
    }
    public DynamicCircularQueue(int size){
        super(size);
    }
    public void add(int val) throws Exception{
        if(isFull()){
            int[] temp =new int[2*this.data.length];
            if (e>s){
                int k=0;
                for (int i = s; i <=e ; i++) {
                    temp[k]=data[i];
                    k++;
                }
            }
            else{
                int k=0;
                for (int i = s; i < data.length; i++) {
                    temp[k]=data[i];
                    k++;
                }
                for (int i = 0; i <=e ; i++) {
                    temp[k]=data[i];
                    k++;
                }
            }
            s=0;
            e=data.length-1;
            this.data=temp;
        }
        super.add(val);
    }


}
