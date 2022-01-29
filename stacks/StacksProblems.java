package stacks;

import java.util.Stack;

public class StacksProblems {
    public static void main(String[] args) {
        
    }

    public static boolean balance(char[] arr) {

        Stack<Character> stack = new Stack<>();

        for (var c : arr) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }

            if (stack.peek() == null) {
                return false;
            }

            Character check;
            switch (c) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[') {
                        return false;
                    }
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[') {
                        return false;
                    }
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{') {
                        return false;
                    }
                    break;
            }
        }
        return stack.peek() == null;
    }

}
