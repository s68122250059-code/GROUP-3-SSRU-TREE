public class Node {
    String data;
    Node left;
    Node right;

    public Node(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    // เช็คว่าเป็น เครื่องหมายคำนวณ (+, -, *, /) หรือไม่
    public boolean isOperator() {
        return data.equals("+") || data.equals("-") || 
               data.equals("*") || data.equals("/");
    }
}