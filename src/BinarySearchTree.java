/**
 * Created by xcptan on 04/08/2016.
 */
public class BinarySearchTree {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(7);
        head.left = new TreeNode(4);
        head.left.left = new TreeNode(1);
        head.left.right = new TreeNode(6);
        head.right = new TreeNode(9);

        System.out.println(isBinarySearchTree(head));

        delete(head, 4);

        System.out.println(isBinarySearchTree(head));

        delete(head, 9);

        System.out.println(isBinarySearchTree(head));

        delete(head, 7);

        System.out.println(isBinarySearchTree(head));

        delete(head, 1);

        System.out.println(isBinarySearchTree(head));



    }

    public static TreeNode delete(TreeNode head, int value){
        if(head == null){
            return head;
        }

        //Value lies somewhere at the left traverse,
        else if(value < head.value){
            head.left = delete(head.left,value);
        }

        //Value lies somewhere at the right traverse,
        else if(value > head.value){
            head.right = delete(head.right,value);
        }

        //value is equal
        else{
            // case 1, no child
            if(head.left == null && head.right == null){
                head = null;
            }

            // case 2, one child
            else if(head.left == null && head.right != null){
                TreeNode temp = head;
                head = head.right;
                temp = null;
            }

            // case 2, one child
            else if(head.left != null && head.right == null){
                TreeNode temp = head;
                head = head.left;
                temp = null;
            }


            // case 3, two child, right child is always set as new parent
            else{
                TreeNode temp = findMin(head.right);
                head.value = temp.value;
                head.right = delete(head.right,temp.value);
            }
        }
        return head;
    }

    public static TreeNode findMin(TreeNode head){
        while(head.left!=null){
            head = head.left;
        }
        return head;
    }

    //Check if tree is binary search tree
    // Let's look at what order traversal is most useful here...
    // Left most element should be the least
    // Right most element should the greatest
    // Out of the tree traversal algorithms...
    // Inorder seems to be the fit

    // Now we can print out the values we need to find a way to save the previous
    // treenode if its value is less than the current treenode
    static boolean isBinarySearchTree(TreeNode head) {
        java.util.Stack<TreeNode> stack = new java.util.Stack<TreeNode>();
        java.util.Stack<TreeNode> resultStack = new java.util.Stack<TreeNode>();

        TreeNode itr = head;

        boolean isDone = false;

        while(!isDone){
            if(itr != null){
                stack.push(itr);
                itr = itr.left;
            }else if(stack.isEmpty()){
                isDone = true;
            }else{
                itr = stack.pop();
                System.out.println(itr.value);
                if(resultStack.size() > 0) {
                    if (resultStack.peek().value > itr.value){
                        return false;
                    }
                }
                resultStack.push(itr);
                itr = itr.right;
            }
        }

        return true;
    }
}
