package problem2.main;

public class Travarsal {
    void printPostorder(TreeNode node) {
        if (node == null)
            return;
        printPostorder(node.getLeft());
        printPostorder(node.getRight());
        System.out.print(node.getData() + " ");
    }
}
