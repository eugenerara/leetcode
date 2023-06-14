package Questions.Easy;

import java.util.Stack;

/**
 * Valid Parentheses
 */
public class Q20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int a = 0; a < s.length(); a++) {
            if (s.charAt(a) == '(') {
                stack.push(')');
            }
            else if (s.charAt(a) == '[') {
                stack.push(']');
            }
            else if (s.charAt(a) == '{') {
                stack.push('}');
            }
            else if (stack.isEmpty() || stack.pop() != s.charAt(a)) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
