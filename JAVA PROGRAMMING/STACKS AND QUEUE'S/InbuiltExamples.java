import java.util.*;

public class InbuiltExamples {
    public static void main(String[] args) {
//        Stack<Integer> stack =new Stack<>();
//        stack.push(24);
//        stack.push(30);
//        stack.push(50);
//        stack.push(90);
//       System.out.println(stack);
//        stack.pop();
//        System.out.println(stack.peek());

//        Queue<Integer> queue = new LinkedList<>();  // as Queue is an interface and Linked List implements Queue
//        queue.add(40);
//        queue.add(20);
//        queue.add(10);
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        Deque<Integer> deque =new LinkedList<>();   // similarly but in deque we can add from left and right as well also for removing
        deque.addFirst(20);
        deque.addLast(30);
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
