import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsQueue {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
//        because we are using push method it will be last in first out
        queue.push(1);
        queue.push(2);
        queue.push(3);
//        remove method will be remove last one as in stack
        queue.remove();
        System.out.println(queue);
//         pop will remove first one?
        System.out.println(queue.pop());
        for(int i = 1; i <= 5;i++){
            queue.add(i);
        }
        System.out.println(queue);
        System.out.println(new ReverseFirstKElementsQueue().reverseFirst(queue,3));



    }

//    1212345
//    1212345

    public Deque<Integer> reverseFirst(Deque<Integer> queue,int k){
        Stack<Integer> stack = new Stack<>();
//        we take from 0 till k element and put to stack in this way it will be in reversed order
//        1234 in stack it will be 4321 since first in last out
        for(int i = 0; i < k;i++){
            stack.push(queue.remove());
        }
//      we are putting reversed values 4321 back to queue
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
//         since we removed first k item now items after k will be first so we need to make reversed item first
        for(int i = 0; i < queue.size()-k;i++){
            queue.add(queue.remove());
        }
        return queue;

    }
}
