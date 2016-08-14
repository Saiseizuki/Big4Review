/**
 * Created by xcptan on 31/07/2016.
 */
public class Queue {
    //First in first out

    Node first;
    Node last;

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(new Node(1));
        queue.enqueue(new Node(2));
        queue.enqueue(new Node(3));
        queue.enqueue(new Node(4));
        queue.enqueue(new Node(5));

        queue.printQueue();

        queue.dequeue();

        queue.printQueue();

        queue.enqueue(new Node(1));

        queue.printQueue();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.printQueue();

        queue.enqueue(new Node(3));
        queue.enqueue(new Node(4));
        queue.enqueue(new Node(5));

        queue.printQueue();
    }

    void enqueue(Node node){

        //Initial case;
        if(first == null){
            first = node;
            last = node;
        }else{
            last.next = node;
            last = last.next;
        }
    }

    Node dequeue(){
        if(first != null){
            Node dequeued = first;
            first= first.next;
            return dequeued;
        }
        return null;
    }

    void printQueue(){
        Node itr = first;
        while (itr!=null){
            System.out.print(itr.val + " -> ");
            itr = itr.next;
        }
        System.out.println();
    }
}
