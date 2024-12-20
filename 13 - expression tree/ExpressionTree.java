import java.util.Stack;

public class ExpressionTree {
    private Boolean isOperator(Character character) {
        return character == '+' || character == '-' || character == '*' || character == '/' || character == '^';
    }

    private Node rootNode;

    public ExpressionTree(String postfixExpression) {
        this.rootNode = generateTree(postfixExpression);
    }

    private Node generateTree(String postfixExpression) {
        Stack<Node> stack = new Stack<Node>();

        for (Character token : postfixExpression.toCharArray()) {
            if (!isOperator(token)) {
                stack.push(new Node(token));
            } else {
                Node tempNode = new Node(token);
                tempNode.rightNode = stack.pop();
                tempNode.leftNode = stack.pop();

                stack.push(tempNode);
            }
        }

        return stack.pop();
    }

    @Override
    public String toString() {
        return inorderToString(this.rootNode);
    }

    private String inorderToString(Node root) {
        String inorderString = "";
        if (root != null) {
            String leftInorder = inorderToString(root.leftNode);
            inorderString += leftInorder + " ";
            inorderString += root.data + " ";
            String rightInorder = inorderToString(root.rightNode);
            inorderString += rightInorder + "";
        }
        return inorderString;
    }
}

class Node {
    Node rightNode;
    Node leftNode;
    Character data;

    Node(Character data) {
        this.data = data;
    }
}