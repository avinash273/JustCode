package Leetcode;

import java.util.HashSet;

public class SingleNumber6 {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
            } else if (set.contains(num)) {
                set.remove(num);
            }
        }
        for (int res : set) {
            return res;
        }
        return 0;
    }
}
