public class Main {
    public static void main(String[] args) {
        // Expression 4: ((8+2)*(9-5))/2 in Postfix format
        String[] postfixInput = {"8", "2", "+", "9", "5", "-", "*", "2", "/"};

        System.out.println("=== Build Expression Tree from Postfix ===");
        
        // 1. Build Tree
        Node root = ExpressionTree.buildFromPostfix(postfixInput);

        // 2. Traversals
        System.out.print("Infix   : "); ExpressionTree.printInfix(root); System.out.println();
        System.out.print("Prefix  : "); ExpressionTree.printPrefix(root); System.out.println();
        System.out.print("Postfix : "); ExpressionTree.printPostfix(root); System.out.println();

        // 3. Results & Metrics (English Labels)
        System.out.println("------------------------------------------");
        System.out.println("Evaluation Result  : " + ExpressionTree.evaluate(root));
        System.out.println("Count Operators    : " + ExpressionTree.countOperators(root));
        System.out.println("Count Operands     : " + ExpressionTree.countOperands(root));
        System.out.println("Tree Height        : " + ExpressionTree.treeHeight(root));
    }
}