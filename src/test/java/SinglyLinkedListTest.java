import org.example.linked_list.SinglyLinkedList;
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
}
