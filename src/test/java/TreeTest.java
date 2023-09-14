import org.example.tree.Tree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TreeTest {

    @Test
    @DisplayName("Tree traversal")
    public void testTreeTraversal() {
        Tree tree = new Tree();
        for (int value : new int[]{3, 5, 4, 6, 1, 0, 2}) {
            tree.insert(value);
        }
        System.out.print("Preorder traversal: ");
        tree.preorderTraversal();
        System.out.println();
        System.out.print("Inorder traversal: ");
        tree.inorderTraversal();
        System.out.println();
        System.out.print("Postorder traversal: ");
        tree.postorderTraversal();
        System.out.println();
    }
}
