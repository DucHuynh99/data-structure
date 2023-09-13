import org.example.string.StringDataStructure;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTest {

    @Test
    @DisplayName("String permutation")
    public void testStringPermutation() {
        StringDataStructure.permutation("123");
    }

    @Test
    @DisplayName("String reversion using recursive")
    public void testReverseRecursive() {
        Assertions.assertEquals("321", StringDataStructure.reverseRecursive("123"));
    }
}
