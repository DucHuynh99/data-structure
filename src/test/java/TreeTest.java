import org.example.tree.Tree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TreeTest {

    private Tree initTree() {
        Tree tree = new Tree();
        for (int value : new int[]{3, 5, 4, 6, 1, 0, 2}) {
            tree.insert(value);
        }
        return tree;
    }

    @Test
    @DisplayName("Tree traversal")
    public void testTreeTraversal() {
        Tree tree = initTree();
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

    @Test
    @DisplayName("Find value in tree")
    public void testTreeFind() {
        Tree tree = initTree();
        Assertions.assertFalse(tree.find(10));
        Assertions.assertTrue(tree.find(1));
    }

    @Test
    @DisplayName("Print at given level")
    public void testTreePrintGivenLevel() {
        Tree tree = initTree();
        tree.printGivenLevel(1);
        System.out.println();
        tree.printGivenLevel(2);
        System.out.println();
        tree.printGivenLevel(3);
    }

    @Test
    @DisplayName("Get height")
    public void testHeight() {
        Tree tree = initTree();
        Assertions.assertEquals(3, tree.height());
    }

    @Test
    @DisplayName("Test print leaves node")
    public void testPrintLeaves() {
        Tree tree = initTree();
        tree.printLeaves();
    }

    @Test
    @DisplayName("Test count leaves node")
    public void testCountLeaves() {
        Tree tree = initTree();
        Assertions.assertEquals(4, tree.countLeaves());
    }
}
