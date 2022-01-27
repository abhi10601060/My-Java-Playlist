package Lec6.ComparingClasses;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(12,85.6f);
        Student abhi=new Student(6,95.8f);
        Student himanshu=new Student(10,56.8f);
        Student shubham=new Student(8,98.9f);
        Student rahul=new Student(2,75.0f);
        Student[] list ={kunal,abhi,himanshu,shubham,rahul};

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

//        if(abhi.compareTo(kunal)>0){
//            System.out.println("abhi is better than kunal.");
//        }

    }
}
