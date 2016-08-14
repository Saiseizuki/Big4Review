/**
 * Created by xcptan on 31/07/2016.
 */
public class SwapNodeLL {

    // We want to swap the kth element of a linked list
    // Ex:
    // 1 -> 2 -> 3 -> 4 -> 5
    // swapKth(nodeHead, position);
    // swapKth(head, 1);
    // LinkedList must now be:
    // 1 -> 4 -> 3 -> 2 -> 5

    // Find kth nodes
    // swap their next nodes;
    

    public static void main (String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node.printLinkedList(head);

        //find node before toSwap1

        Node nodeA = head.next;
        Node nodeB = head.next.next.next;

        swapNodes(head, nodeA, nodeB);

        Node.printLinkedList(head);

        System.out.println(getNodeFromStart(head, 1).val);

        swapNodes(head, getNodeFromStart(head, 1), getNodeFromEnd(head, 1));

        Node.printLinkedList(head);
    }

    public static Node getNodeFromStart(Node head, int n){
        Node itr = head;
        int index = 0;
        while(itr != null && index < n){
            itr = itr.next;
            index++;
        }
        return itr;
    }

    public static int getLinkedListSize(Node head){
        Node itr = head;
        int count = 0;

        while(itr != null){
            itr = itr.next;
            count++;
        }

        return count;
    }

    public static Node getNodeFromEnd(Node head, int n){
        Node itr = head;

        int listLength = getLinkedListSize(head);

        int distanceFromEnd = (listLength-1) - n;

        return getNodeFromStart(head,distanceFromEnd);
    }

    public static void swapNodes(Node head, Node nodeA, Node nodeB){
        Node toSwap1 = nodeA; // Node to be swapped 1
        Node toSwap1Preceding = findPrecedingNode(head, toSwap1); // This should be 1
        Node toSwap1Next = toSwap1.next; // Connect swapped node's next to this

        Node toSwap2 = nodeB; // Node to be swapped 4
        Node toSwap2Preceding = findPrecedingNode(head, toSwap2); // this should be 3
        Node toSwap2Next = toSwap2.next; // Connect swapped node's next to this

        toSwap1Preceding.next = toSwap2;
        toSwap2.next = toSwap1Next;

        toSwap2Preceding.next = toSwap1;
        toSwap1.next = toSwap2Next;
    }

    public static Node findPrecedingNode(Node head, Node toFind){
        Node itr = head;
        while(itr.next != null){
            if(itr.next == toFind){
                return itr;
            }
            itr = itr.next;
        }
        return null;
    }


}
