package org.example.string;

public class StringDataStructure {

    public static void permutation(String input) {
        permutation("", input);
    }

    private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.out.println(perm + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1));
            }
        }
    }

    public static String reverseRecursive(String input) {
        if (input == null || input.length() < 2)
            return input;
        return reverseRecursive(input.substring(1)) + input.charAt(0);
    }
}
