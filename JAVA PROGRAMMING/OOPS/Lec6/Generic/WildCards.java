package Lec6.Generic;

public class WildCards <T extends  Number>{   // so here in  wildcards you can restrict the type of class
                                                // it can only allow that class and every subclass of it so here you
                                                // can use Number class and Integer, Float Classes also which is its subclass

    private Object[] data;
    private int DEFAULT_SIZE=10;
    private int size;

    public WildCards(){
        this.data=new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(size==data.length){
            Object [] temp=new Object[2*data.length];
            for (int i = 0; i < data.length; i++) {
                temp[i]=this.data[i];
            }
            this.data=temp;
        }
        data[size]=num;
        size++;
    }
    public T pop(){
        T popped=(T)this.data[--size];
        return popped;
    }
    public T get(int idx){
        return (T)this.data[idx];
    }
    public  String toString(){
        String ans="[";
        for (int i = 0; i < size; i++) {
            ans+=data[i];
            ans+=",";
        }
        ans+="]";
        return ans;
    }

    public static void main(String[] args) {
//        WildCards<String> list = new WildCards<String>();
    }
}
