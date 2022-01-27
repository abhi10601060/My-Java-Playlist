package Lec3.INHERITANCE;

public class Main {
    public static void main(String[] args) {
//        Human abhi=new Human();
//        System.out.println(abhi.age);
//        Fish a =new Fish();
//        System.out.println(a.age);

        Box b1= new Box(2,3,5);
//        System.out.println(b1.l);
//        b1.getdimension();
        BoxWeight bw1= new BoxWeight(2,3,5,8);
        bw1.getdimension();
    }

}
class Species{
    int age=21;
}
class Human extends Species{

}
class Fish extends Species{

}