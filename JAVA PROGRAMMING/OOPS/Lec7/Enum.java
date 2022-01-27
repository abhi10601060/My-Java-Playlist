package Lec7;

public class Enum {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        // it is similar to class
        //cannot inherit a class but cam implement Interfaces as many want
        //every method is public static and final
        //this is used for constants variable
        Week(){
            System.out.println("constructor is used for "+ this);  // even though it initializes for every single constatnt
        }
        void dislay(){
            System.out.println(this);
        }
    }

    public static void main(String[] args) {
        Week week= Week.Monday;
        // internally Week Monday = new Week();
        week.dislay();
    }
}
