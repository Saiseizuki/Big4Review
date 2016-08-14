import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.Stack;

/**
 * Created by xcptan on 29/07/2016.
 */
public class Trees {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.left.left = new Node(4);
        head.left.right = new Node(5);

        head.right = new Node(3);
        head.right.left = new Node(6);
        head.right.right = new Node(7);

        doInorderTraversal(head);

        dopreOrderTraversal(head);

        dopostOrderTraversal(head);
    }

    public static void dopostOrderTraversal(Node head) {



        if(head.left != null) {
            dopostOrderTraversal(head.left);
        }


        if(head.right!=null) {
            dopostOrderTraversal(head.right);
        }

        System.out.println("Post order:: " + head.val);
    }

    public static void dopreOrderTraversal(Node head) {

        System.out.println("Preorder: " + head.val);

        if(head.left != null) {
            dopreOrderTraversal(head.left);
        }


        if(head.right!=null) {
            dopreOrderTraversal(head.right);
        }
    }

    public static void doInorderTraversal(Node head) {
        if(head.left != null) {
            doInorderTraversal(head.left);
        }

        System.out.println("Inorder" + head.val);

        if(head.right!=null) {
            doInorderTraversal(head.right);
        }

    }

    public static class Node {
        Node left;
        Node right;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }
}
