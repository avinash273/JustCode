import Leetcode.ReverseVowelsString345;
import Leetcode.twoSumMain;

public class Main {
    public static void main(String[] args) {

        /**
         * Main function used to call all program
         * -Avinash Shanker
         */

        System.out.println("Main function used to call all program \n");

        /**
         * https://leetcode.com/problems/two-sum/
         * Input: nums = [2,7,11,15], target = 9
         * Output: [0,1]
         * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
         */
        twoSumMain twoSumVar = new twoSumMain();
        int[] output = twoSumVar.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("1. twoSum: [" + output[0] + "," + output[1] + "]");

        ReverseVowelsString345 reverseVowelsString = new ReverseVowelsString345();
        System.out.println(reverseVowelsString.reverseVowels("hello"));
    }
}