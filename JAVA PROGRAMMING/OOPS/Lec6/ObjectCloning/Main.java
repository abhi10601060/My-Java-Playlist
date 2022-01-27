package Lec6.ObjectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student abhi= new Student(21,"abhi");
        Student rahul= new Student(abhi);
        System.out.println(rahul.name);
        rahul.name="rahul";
        System.out.println(abhi.name);
        System.out.println(rahul.name);
        rahul.arr[0]=100;
        System.out.println(Arrays.toString(abhi.arr));  // this is the shallow clone or shallow copying
                                                        // here i changed rahul's arr but it changed for abhi also

        Student twin= (Student)abhi.clone();
        twin.arr[0]=200;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(abhi.arr));
    }
}
