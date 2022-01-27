package Lec6.Generic;

public class GenericArrayList<T>{
    private Object[] data;
    private int DEFAULT_SIZE=10;
    private int size;

    public GenericArrayList(){
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
        GenericArrayList<Integer> list= new GenericArrayList<>();
        list.add(10);
        for (int i = 3; i < 15; i++) {
            list.add(2*i);
        }
        list.pop();
        System.out.println(list.toString());
        GenericArrayList<String> list1= new GenericArrayList<>();
        list1.add("hjasd");
        System.out.println(list1.toString());
    }

}
