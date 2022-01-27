public class Class_variable {
    static int x =90;

    public static void main(String[] args) {
        System.out.println(x);

//        int x=10000;   when i initialize another variable with same name as class variable it becomes scopen variable and i can not access class variable in that scope

        x =100;          /* here i changed the class variable value */


        System.out.println(x);
        fun();
    }
    static void fun(){
        x+=100;
        System.out.println(x);
    }
}
