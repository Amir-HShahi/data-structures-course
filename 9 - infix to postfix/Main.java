public class Main {
    public static void main(String[] args) {
        InfixToPrefix converter = new InfixToPrefix();
        String expression = "(a+b)*c";
        System.out.println("Infix Expression: " + expression);
        System.out.println("Prefix Expression: " + converter.infixToPrefix(expression));
    }
}
