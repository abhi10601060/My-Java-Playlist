package Lec5.AbstarctClass;

public abstract class Parent {
    static int age;
    Parent(int age){
        Parent.age=age;
    }
    abstract void carrer();
    abstract void partner();
}
