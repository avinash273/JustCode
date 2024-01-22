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

    public int singleNumber2(int[] nums) {
        //2∗(a+b+c)−(a+a+b+b+c)=c
        HashSet<Integer> set = new HashSet<>();
        int runningSum = 0;
        int setSum = 0;

        for (int num : nums) {
            set.add(num);
            runningSum += num;
        }

        for(int num2 : set){
            setSum += num2;
        }
        return (2*setSum) - runningSum;
    }

    public int singleNumber3(int[] nums) {
        //XOR 5 ^ 5 = 0 and there is other way
        int result = 0;

        for (int num : nums) {
            result ^= num;;
        }
        return result;
    }

}
