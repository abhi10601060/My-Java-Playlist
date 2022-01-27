package Lec6.ObjectCloning;

public class Student implements Cloneable{
    int age;
    String name;
    int[] arr;
    public Student(int age  , String name){
        this.age=age;
        this.name=name;
        this.arr= new  int[] {1,2,3,4,5,6};
    }
    public  Student(Student o){
        this.age=o.age;
        this.name=o.name;
        this.arr= o.arr;
    }
    public Object clone() throws  CloneNotSupportedException{
        Student twin=  (Student)super.clone();
        twin.arr= new int[this.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i]=this.arr[i];
        }
        return twin;
    }

}
