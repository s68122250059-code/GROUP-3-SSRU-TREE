import java.util.Stack;

public class ExpressionTree {

    // --- Algorithm A: BUILD_TREE จาก Postfix (ใช้ Stack) ---
    public static Node buildFromPostfix(String[] tokens) {
        Stack<Node> stack = new Stack<>();
        for (String token : tokens) {
            Node node = new Node(token);
            if (node.isOperator()) {
                node.right = stack.pop();
                node.left = stack.pop();
            }
            stack.push(node);
        }
        return stack.pop();
    }

    // --- Algorithm B: BUILD_TREE จาก Prefix (ใช้ Recursion) ---
    private static int prefixIndex = 0;
    public static Node buildFromPrefix(String[] tokens) {
        prefixIndex = 0; // Reset index
        return buildPrefixHelper(tokens);
    }

    private static Node buildPrefixHelper(String[] tokens) {
        if (prefixIndex >= tokens.length) return null;

        String token = tokens[prefixIndex++];
        Node node = new Node(token);

        if (node.isOperator()) {
            node.left = buildPrefixHelper(tokens);
            node.right = buildPrefixHelper(tokens);
        }
        return node;
    }

    // --- SEARCH: ค้นหาโหนดใน Tree ---
    public static boolean search(Node root, String target) {
        if (root == null) return false;
        if (root.data.equals(target)) return true;
        return search(root.left, target) || search(root.right, target);
    }

    // --- EVALUATE: คำนวณผลลัพธ์ ---
    public static double evaluate(Node root) {
        if (root == null) return 0;
        if (!root.isOperator()) return Double.parseDouble(root.data);

        double leftVal = evaluate(root.left);
        double rightVal = evaluate(root.right);

        if (root.data.equals("+")) return leftVal + rightVal;
        if (root.data.equals("-")) return leftVal - rightVal;
        if (root.data.equals("*")) return leftVal * rightVal;
        if (root.data.equals("/")) return leftVal / rightVal;

        return 0;
    }

    // --- TRAVERSALS ---
    public static void printInfix(Node root) {
        if (root != null) {
            if (root.isOperator()) System.out.print("( ");
            printInfix(root.left);
            System.out.print(root.data + " ");
            printInfix(root.right);
            if (root.isOperator()) System.out.print(") ");
        }
    }

    public static void printPrefix(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            printPrefix(root.left);
            printPrefix(root.right);
        }
    }

    public static void printPostfix(Node root) {
        if (root != null) {
            printPostfix(root.left);
            printPostfix(root.right);
            System.out.print(root.data + " ");
        }
    }

    // --- METRICS ---
    public static int countOperators(Node root) {
        if (root == null) return 0;
        int count = root.isOperator() ? 1 : 0;
        return count + countOperators(root.left) + countOperators(root.right);
    }

    public static int countOperands(Node root) {
        if (root == null) return 0;
        int count = !root.isOperator() ? 1 : 0;
        return count + countOperands(root.left) + countOperands(root.right);
    }

    public static int treeHeight(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(treeHeight(root.left), treeHeight(root.right));
    }
}
