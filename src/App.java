import easy.*;
import medium.CountingBits_338;

public class App {

    public static void main(String[] args) {

        MyQueue_232 myQueue = new MyQueue_232();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        myQueue.peek();  //return 1
        myQueue.pop(); // return 1, queue is [2]
        myQueue.empty(); // return false

    }



}
