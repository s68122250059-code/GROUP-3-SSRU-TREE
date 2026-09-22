public class Main {
    public static void main(String[] args) {
        // -------------------------------------------------------------------
        // 1. Algorithm A: Build Tree จาก Postfix (ใช้ Stack)
        // -------------------------------------------------------------------
        String[] postfixInput = {"8", "2", "+", "9", "5", "-", "*", "2", "/"};
        System.out.println("=== Algorithm A: Build Tree from Postfix (Stack) ===");
        Node rootA = ExpressionTree.buildFromPostfix(postfixInput);

        System.out.print("Infix   : "); ExpressionTree.printInfix(rootA); System.out.println();
        System.out.print("Prefix  : "); ExpressionTree.printPrefix(rootA); System.out.println();
        System.out.print("Postfix : "); ExpressionTree.printPostfix(rootA); System.out.println();
        System.out.println("Evaluate Result : " + ExpressionTree.evaluate(rootA));
        System.out.println("Tree Height     : " + ExpressionTree.treeHeight(rootA));

        System.out.println("\n--------------------------------------------------\n");

        // -------------------------------------------------------------------
        // 2. Algorithm B: Build Tree จาก Prefix (ใช้ Recursion)
        // -------------------------------------------------------------------
        String[] prefixInput = {"/", "*", "+", "8", "2", "-", "9", "5", "2"};
        System.out.println("=== Algorithm B: Build Tree from Prefix (Recursion) ===");
        Node rootB = ExpressionTree.buildFromPrefix(prefixInput);

        System.out.print("Infix   : "); ExpressionTree.printInfix(rootB); System.out.println();
        System.out.print("Prefix  : "); ExpressionTree.printPrefix(rootB); System.out.println();
        System.out.print("Postfix : "); ExpressionTree.printPostfix(rootB); System.out.println();
        System.out.println("Evaluate Result : " + ExpressionTree.evaluate(rootB));
        System.out.println("Tree Height     : " + ExpressionTree.treeHeight(rootB));
    }
}
