package Lec6.ComparingClasses;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;
     public Student(int rn, float m){
         this.rollno=rn;
         this.marks=m;
     }

    @Override
    public String toString() {
        return this.marks + "";
    }

    @Override
    public int compareTo(Student o) {  // this method internaly used to compare 2 objects of this class
        int diff= (int)(this.marks-o.marks);
        return diff;
    }
}
