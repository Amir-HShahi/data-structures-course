import java.util.Stack;

public class InfixToPrefix {

    private int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    private String reverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '(') {
                result += ')';
            } else if (c == ')') {
                result += '(';
            } else {
                result += c;
            }
        }
        return result.toString();
    }

    public String infixToPrefix(String expression) {
        expression = reverse(expression);
        Stack<Character> stack = new Stack<>();
        String result = "";

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result += c;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result += stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return reverse(result.toString());
    }
}
