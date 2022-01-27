package Lec5.AbstarctClass;

public class Main {
    public static void main(String[] args) {
        System.out.println(Parent.age);
        Son son = new Son(45);
        System.out.println(Parent.age);
        Daughter d= new Daughter(20);
        System.out.println(d.age);
        d.carrer();
        son.carrer();
    }
}
