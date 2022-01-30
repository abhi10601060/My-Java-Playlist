public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CircularQueue q =new CircularQueue(6);
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        q.add(5);
//        q.add(6);
//        q.display();
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        q.add(5);
//        q.add(20);
//        q.add(30);
//        q.add(40);
//        q.remove();
//        q.getEnd();
//        q.getStart();
//        q.display();


        CircularQueue q=new DynamicCircularQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.remove();
        q.add(10);
        q.add(22);
        q.add(33);
        q.add(45);
        q.add(56);

        q.getStart();
        q.getEnd();

        q.display();
        q.add(500);
        q.display();
    }
}
