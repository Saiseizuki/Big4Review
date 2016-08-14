import java.util.*;

/**
 * Created by xcptan on 04/08/2016.
 */
public class BalanceParentheses {

    public static void main(String[] args) {
        String input = "[{]}";
        java.util.Stack<Character> stack = new java.util.Stack<Character>();

        boolean isLegal = true;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c == '{' || c == '(' || c == '[') {
                stack.push(input.charAt(i));
            }else {
                if(stack.size() > 0) {
                    if (stack.peek() == '{' && c == '}') {
                        stack.pop();
                    } else if (stack.peek() == '(' && c == ')') {
                        stack.pop();
                    } else if (stack.peek() == '[' && c == ']') {
                        stack.pop();
                    }else{
                        isLegal = false;
                        break;
                    }
                }else{
                    isLegal = false;
                    break;
                }
            }
        }

        if(stack.size() > 0){
            isLegal = false;
        }

        System.out.println(input + " " + isLegal);


    }
}
