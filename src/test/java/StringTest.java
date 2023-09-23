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

    @Test
    @DisplayName("Check rotation string")
    public void testRotation() {
        Assertions.assertTrue(StringDataStructure.checkRotation("OneTwoThree", "TwoThreeOne"));
        Assertions.assertFalse(StringDataStructure.checkRotation("OneTwoThree", "ThreeTwoOne"));
    }

    @Test
    @DisplayName("Check palindrome string")
    public void testPalindrome() {
        Assertions.assertTrue(StringDataStructure.checkPalindrome(null));
        Assertions.assertTrue(StringDataStructure.checkPalindrome(" "));
        Assertions.assertTrue(StringDataStructure.checkPalindrome("ABBA"));
        Assertions.assertFalse(StringDataStructure.checkPalindrome("ABAB"));
    }

    @Test
    @DisplayName("Test print duplicate characters")
    public void testPrintDuplicateCharacters() {
        StringDataStructure.printDuplicateCharacters("TARA");
    }

    @Test
    @DisplayName("Test find first non-repeat character")
    public void testFindFirstNonRepeatedCharacter() {
        Assertions.assertEquals('Y', StringDataStructure.findFirstNonRepeatedCharacter("PAPAYA"));
        Assertions.assertNull(StringDataStructure.findFirstNonRepeatedCharacter("ABBA"));
    }
}
