package Lec2;

import java.util.Scanner;

public class Human {
    String name;
    int age;
    boolean ismarried;
    static long population;  // static variable - not dependent on object

    public Human(String name, int age,boolean isMarried){
        this.name=name;
        this.age=age;
        this.ismarried=isMarried;
        Human.population++;
    }
    public Human(){
        System.out.println("Human is created....");
        Human.population++;
    }
    public static void message(){              // static method - you can use without making its object
        System.out.println("Hello World...");
//        System.out.println(this.name);        // you can not use this here as it does not dependent upon the object
    }

    public static void main(String[] args) {
        Human himanshu =new Human();
        System.out.println(Human.population);

    }
}
