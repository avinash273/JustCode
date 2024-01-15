package Leetcode;

public class ReverseString344 {
    class Solution {
        public void reverseString(char[] s) {
            int left = 0;
            int right = s.length - 1;

            while(left < right){
                char memory = s[left];
                s[left++] = s[right];
                s[right--] = memory;
            }
        }
    }
}
