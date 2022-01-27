package Lec6.Generic;

public class CustomArrayList {
    private int[] data;
    private int DEFAULT_SIZE=10;
    private int size;

    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(size==data.length){
            int [] temp=new int[2*data.length];
            for (int i = 0; i < data.length; i++) {
                temp[i]=this.data[i];
            }
            this.data=temp;
        }
        data[size]=num;
        size++;
    }
    public int pop(){
        int popped=this.data[--size];
        return popped;
    }
    public int get(int idx){
        return this.data[idx];
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
        CustomArrayList list= new CustomArrayList();
        list.add(50);
        list.add(26);
        list.add(80);
        for (int i = 3; i < 15; i++) {
            list.add(2*i);

        }
        list.pop();
        System.out.println(list.toString());
    }
}
