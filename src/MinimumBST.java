import java.util.*;

/**
 * Created by xcptan on 11/08/2016.
 */
public class MinimumBST {

    public static void main(String[] args) {
        MinimumBST minimumBST = new MinimumBST();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        //We have a binary search tree here
        TreeNode head = minimumBST.minimalBST(arr);

        minimumBST.printInorder(head);

        System.out.println();
        java.util.LinkedList<Node> list = new java.util.LinkedList<Node>();
        minimumBST.traverseWithCounter(list,2, head,0);

        System.out.println();
        for(Node node : list){
            System.out.print(node.val + " -> ");
        }
    }

    void traverseWithCounter(java.util.LinkedList<Node> listHead, int level, TreeNode head, int n){
        if(head != null) {
            System.out.println("Going left... " + n);
            traverseWithCounter(listHead, level, head.left, ++n);
            --n;
            System.out.println(head.value + " distance from root " + n + "->");

            if(n == level){

                Node newNode = new Node(head.value);
                listHead.push(newNode);

                System.out.println("*** Added "+head.value + " in list");
            }
            System.out.println("Going right..." + n);
                    traverseWithCounter(listHead, level,head.right,++n);
        }
    }

    TreeNode minimalBST(int[] arr) {
        return addToTree(arr,0,arr.length-1);
    }

    TreeNode addToTree(int[] arr, int start, int end){
        if (end < start) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = addToTree(arr, start, mid - 1);
        node.right = addToTree(arr, mid + 1, end);
        return node;
    }


    void printInorder(TreeNode head){
        if(head != null) {
            printInorder(head.left);
            System.out.print(head.value + "->");
            printInorder(head.right);
        }

    }

}
