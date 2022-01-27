package Lec2;

import static Lec2.Human.message;

public class StaticVariables {
    public static void main(String[] args) {
        System.out.println(Human.population);
        Human abhi=new Human("Abhi",21,false);
        Human rahul=new Human();
        Human shubham=new Human();
        System.out.println(abhi.age);
        System.out.println(Human.population);
        System.out.println(rahul.name);
//        message();
//        Human.message();
        Human.population++;
        System.out.println(Human.population);  // tou can use static variables without object explicitly also
    }

}
