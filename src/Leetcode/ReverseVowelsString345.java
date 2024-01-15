package Leetcode;

import java.util.HashMap;

public class ReverseVowelsString345 {
    public String reverseVowels(String s) {
        char[] letters = s.toCharArray();
        int right = s.length() - 1;
        int left = 0;
        HashMap<Character, Integer> vowels = new HashMap<>();
        vowels.put('a', 1);
        vowels.put('e', 1);
        vowels.put('i', 1);
        vowels.put('o', 1);
        vowels.put('u', 1);
        vowels.put('A', 1);
        vowels.put('E', 1);
        vowels.put('I', 1);
        vowels.put('O', 2);
        vowels.put('U', 1);



        while (left < right) {
            if (vowels.containsKey(letters[left]) && vowels.containsKey(letters[right])) {
                char memory = letters[left];
                letters[left] = letters[right];
                letters[right] = memory;
                left++;
                right--;
            }
            else if (!vowels.containsKey(letters[left]) && vowels.containsKey(letters[right])){
                left++;
            }
            else if (vowels.containsKey(letters[left]) && !vowels.containsKey(letters[right])){
                right--;
            }
            else {
                left++;
                right--;
            }
        }
        return String.valueOf(letters);
    }
}
