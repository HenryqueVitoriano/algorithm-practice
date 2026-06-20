package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exercise01 {
    public static void main(String[] args) {
        /*
           Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
           You may assume that each input would have exactly one Solution, and you may not use the same element twice.
           You can return the answer in any order.
        */

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(Solution(nums, target)));


    }

    public static int[] Solution(int[] nums, int target) {
        Map<Integer, Integer> result = new HashMap<>();
        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (result.containsKey(nums[i])) {
                answer[0] = result.get(nums[i]);
                answer[1] = i;
            }

            int value = target - nums[i];

            result.put(value, i);

        }

        return answer;

    }


}
