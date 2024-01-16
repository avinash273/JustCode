package Leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class ReverseVowelsString345 {
    public String reverseVowels(String s) {
        HashSet<Character> isVowel = new HashSet<>();
        isVowel.add('a');
        isVowel.add('e');
        isVowel.add('i');
        isVowel.add('o');
        isVowel.add('u');
        isVowel.add('A');
        isVowel.add('E');
        isVowel.add('I');
        isVowel.add('O');
        isVowel.add('U');

        char[] letter = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            //left is not vowel increment
            if (!isVowel.contains(letter[left])) {
                left++;
            }
            //right is not vowel increment
            else if (!isVowel.contains(letter[right])) {
                right--;
            }
            //is both vowel swap
            else if (isVowel.contains(letter[left]) && isVowel.contains(letter[right])) {
                char memory = letter[left];
                letter[left++] = letter[right];
                letter[right--] = memory;
            }
        }
        return new String(letter);
    }
}
