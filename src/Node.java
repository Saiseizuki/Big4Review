public class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

    public Node(){}

    public static void printLinkedList(Node head){
        Node itr = head;
        while(itr != null){
            System.out.print(itr.val + " -> ");
            itr =  itr.next;
        }
        System.out.println();
    }
}