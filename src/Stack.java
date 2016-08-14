/**
 * Created by xcptan on 31/07/2016.
 */
public class Stack {
    //First in - Last out
    //Keep 'top' as reference to top of stack
    Node top;

    public static void main (String[] args){
        Stack stack = new Stack();
        stack.push(new Node(1));
        stack.push(new Node(2));

        stack.push(new Node(3));

        stack.push(new Node(4));
        stack.push(new Node(5));

        stack.printStack();

        stack.pop();

        stack.pop();

        stack.pop();

        stack.printStack();

        stack.push(new Node(10));

        stack.push(new Node(11));
        stack.push(new Node(12));

        stack.printStack();
        stack.pop();

        stack.pop();

        stack.pop();
        stack.pop();

        stack.pop();
        stack.printStack();
        stack.push(new Node(1));
        stack.printStack();


    }

    void push(Node node){
        if(top == null){
            top = node;
        }else{
            Node oldTop = top;
            top = node;
            top.next = oldTop;
        }
    }


    Node pop(){
        // Maintain reference to node to be popped
        // Reassign top to top's next (second to the last of the top stack)
        if(top != null){
            Node item = top;
            top = top.next;
            return item;
        }
        return null;
    }

    void printStack(){
        Node itr = top;
        while (itr!=null){
            System.out.print(itr.val + " -> ");
            itr = itr.next;
        }
        System.out.println();
    }
}
