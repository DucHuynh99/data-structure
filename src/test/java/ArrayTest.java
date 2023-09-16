import org.example.array.ArrayDataStructure;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayTest {

    @Test
    @DisplayName("Find the only repeating element in an array from 1 to n")
    public void testFindRepeating() {
        int[] arr = {5, 4, 3, 3, 2, 1};
        Assertions.assertEquals(3, ArrayDataStructure.findRepeating(arr, arr.length - 1));
    }

    @Test
    @DisplayName("Find the only repeating element in an array from 1 to n")
    public void testFindOneMissing() {
        int[] arr = {5, 3, 2, 1};
        Assertions.assertEquals(4, ArrayDataStructure.findOneMissing(arr, 5));
    }

    @Test
    @DisplayName("Print all sub-array have sum equal k")
    public void testPrintSubArraySumEqual() {
        ArrayDataStructure.printSubArraySumEqual(new int[]{1, -1, 0}, 0);
    }
}
