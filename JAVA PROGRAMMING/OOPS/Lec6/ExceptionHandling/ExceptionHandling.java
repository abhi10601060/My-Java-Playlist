package Lec6.ExceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
//            divide(5,0);
            throw new MyException("this is My Exception...");
        }
        catch(ArithmeticException e){
            System.out.println("this is Arithmetic Exception..."); // if specific sentence you want to throw
        }
        catch(MyException e){
            System.out.println(e.getMessage()); // you can make your own exception also just write message in constructor
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally executed.."); // finally executes at last
        }

    }
    public static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("can not divide...");  // this sentence override the get message method of Exception class
        }
        return a/b;
    }
}
