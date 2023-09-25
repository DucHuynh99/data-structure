import org.example.linked_list.SinglyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SinglyLinkedListTest {

    private SinglyLinkedList initData() {
        SinglyLinkedList linkedList = new SinglyLinkedList(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        return linkedList;
    }

    @Test
    @DisplayName("Test print linked list")
    public void testPrintLinkedList() {
        SinglyLinkedList linkedList = initData();
        linkedList.print();
    }

    @Test
    @DisplayName("Test reverse linked list")
    public void testReverseLinkedList() {
        SinglyLinkedList linkedList = initData();
        System.out.print("Before: ");
        linkedList.print();
        linkedList.reverse();
        System.out.print("After: ");
        linkedList.print();
    }

    @Test
    @DisplayName("Test reverse linked list recursive")
    public void testReverseLinkedListRecursive() {
        SinglyLinkedList linkedList = initData();
        System.out.print("Before: ");
        linkedList.print();
        linkedList.reverseRecursive();
        System.out.print("After: ");
        linkedList.print();
    }

    @Test
    @DisplayName("Test find element")
    public void testFind() {
        SinglyLinkedList linkedList = initData();
        Assertions.assertTrue(linkedList.find(1));
        Assertions.assertTrue(linkedList.find(5));
        Assertions.assertFalse(linkedList.find(6));
    }

    @Test
    @DisplayName("Test remove duplication")
    public void testRemoveDuplication() {
        SinglyLinkedList linkedList = initData();
        linkedList.add(5);
        System.out.print("Before: ");
        linkedList.print();
        linkedList.removeDuplicate();
        System.out.print("After: ");
        linkedList.print();
    }

    @Test
    @DisplayName("Test get nth node from the end")
    public void testLastNode() {
        SinglyLinkedList linkedList = initData();
        Assertions.assertEquals(5, linkedList.getLastNode(1));
        Assertions.assertEquals(4, linkedList.getLastNode(2));
        Assertions.assertEquals(3, linkedList.getLastNode(3));
    }

    @Test
    @DisplayName("Test get middle node")
    public void testMiddleNode() {
        SinglyLinkedList linkedList = initData();
        Assertions.assertEquals(3, linkedList.getMiddleNode());
    }

    @Test
    @DisplayName("Test remove node")
    public void testRemoveNode() {
        SinglyLinkedList linkedList = initData();
        Assertions.assertEquals(5, linkedList.length());
        linkedList.remove(3);
        Assertions.assertEquals(4, linkedList.length());
        Assertions.assertFalse(linkedList.find(3));
    }
}
