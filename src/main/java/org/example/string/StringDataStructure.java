package org.example.string;

import java.util.HashMap;
import java.util.Map;

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
        if (input == null || input.length() < 2) return input;
        return reverseRecursive(input.substring(1)) + input.charAt(0);
    }

    public static boolean checkRotation(String original, String rotation) {
        if (original == null || rotation == null || original.length() != rotation.length()) return false;
        String concatenated = original + original;
        return concatenated.contains(rotation);
    }

    public static boolean checkPalindrome(String input) {
        if (input == null || input.isBlank()) return true;
        return reverseRecursive(input).equals(input);
    }

    public static void printDuplicateCharacters(String input) {
        char[] characters = input.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char character : characters) {
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }
        System.out.printf("List of duplicate characters of '%s' \n", input);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.printf(" %s : %d \n", entry.getKey(), entry.getValue());
            }
        }
    }

    public static Character findFirstNonRepeatedCharacter(String input) {
        char[] characters = input.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char character : characters) {
            map.put(character, map.containsKey(character) ? map.get(character) + 1 : 1);
        }
        for (char character : characters) {
            if (map.get(character) == 1)
                return character;
        }
        return null;
    }

    public static int countVowel(String input) {
        if (input == null || input.isBlank()) {
            return 0;
        }
        int count = 0;
        String vowel = "AaEeIiOoUu";
        for (Character character : input.toCharArray()) {
            if (vowel.indexOf(character) != -1) {
                count++;
            }
        }
        return count;
    }
}
