public class Main {
    public static void main(String[] args) {
        String postfix = "abc+*";
 
        ExpressionTree tree = new ExpressionTree(postfix);
        System.out.println(tree);   
    }
}
