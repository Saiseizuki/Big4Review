/**
 * Created by xcptan on 19/07/2016.
 */
public class ReverseLL {

    public static void main(String[] args) {
        ReverseLL main = new ReverseLL();

        Node dummy = new Node();
        Node head = dummy;

        head.next = new Node();
        head.next.val = 0;
        Node next = main.addToList(1, head.next);
        next = main.addToList(2, next);
        next = main.addToList(3, next);
        next = main.addToList(4, next);
        next = main.addToList(5, next);
        next = main.addToList(6, next);
        next = main.addToList(7, next);

        Node itr = dummy.next;
        main.printLL(itr);
//
//        main.printLL(main.reverseLLRecursion(itr));
//        System.out.println();
        main.printLL(main.recursionReverse(itr));

    }

    private Node recursionReverse(Node head){
        //When list is null or only has 1 item
        if(head == null || head.next == null){
            return head;
        }

        Node prev = head.next;

        head.next = null;

        Node revHead = recursionReverse(prev);

        prev.next = head;

        return revHead;
    }



    private Node reverseLLIter(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node itr = head.next;
        Node revHead = head;
        revHead.next = null;

        while(itr != null){
            Node itrRev = itr;
            itr = itr.next;
            itrRev.next = revHead;
            revHead = itrRev;
        }

        return revHead;
    }


    private Node reverseLLRecursion(Node head) {
        if (head == null) return null; // first question & for detecting end of list

        if (head.next == null) return head; // second question

        Node prev = head.next;

        //Break list.next reference upon passing through to prevent cyclic reference
        head.next = null;

        //Iterate until we get to the end of the list
        Node revHead = reverseLLRecursion(prev);

        //revHead is now at the end of the list, recursion stack will now start to pop entries, values are via the function parameter
        //prev is also at the point where revHead is
        prev.next = head;

        return revHead;
    }


    private void printLL(Node itr) {
        while (itr != null) {
            System.out.println("Val: " + itr.val);
            itr = itr.next;
        }
    }

    private Node addToList(int val, Node tail) {
        tail.next = new Node();
        tail.next.val = val;
        return tail.next;
    }


}
