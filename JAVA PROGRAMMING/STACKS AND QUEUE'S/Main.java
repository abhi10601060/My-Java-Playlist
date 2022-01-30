public class Main {
    public static void main(String[] args) throws Exception {
        CustomStack s=new CustomStack(3);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.display();
        System.out.println(s.pop());
        s.peek();

    }
}
