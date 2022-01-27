package Lec1;

public class Introduction {
    public static void main(String[] args) {
        Student abhi= new Student();
        System.out.println(abhi.name);
        Student rahul = new Student(12,"rahul",98.2f);
        System.out.println(rahul.name);
        abhi=rahul;
        System.out.println(abhi.marks);
        System.out.println(abhi.name);
        abhi.name="kunal";
        System.out.println(rahul.name);
        Student shubham =new Student(15,"shubham",56.8f);
        Student himanshu = new Student(shubham);
        System.out.println(himanshu.name);
        Integer a= 100;
        Integer b=20;
        b=a;
        a=50;
        System.out.println(b);
        System.out.println(a);
        final int c=100;
        


    }
}
class Student{
    int rno;
    String name;
    float marks;

    Student(int roll,String naam,float marks){
        this.rno=roll;
        this.name= naam;
        this.marks=marks;
    }
    Student(){

    }
    Student(Student other){
        this.rno=other.rno;
        this.name= other.name;
        this.marks=other.marks;
    }

}
