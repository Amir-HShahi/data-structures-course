public class Main {
    public static void main(String[] args) {
        String postfix = "abc+*";
 
        ExpressionTree r = new ExpressionTree(postfix);
        System.out.println(r);   
    }
}