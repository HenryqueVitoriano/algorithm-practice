package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exercise217 {
    public static void main(String[] args) {
        /*
        Given an integer array nums,
        return true if any value appears at least twice in the array,
        and return false if every element is distinct.
         */

        int[] nums = {1,2,3,1};
        boolean result = (Solution(nums));
        System.out.println(result);


    }
    public static boolean Solution(int[] nums){
        Map<Integer, Integer> integerMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (integerMap.containsKey(nums[i])){
                return true;
            }

            integerMap.put(nums[i], i);
        }
        return false;
    }
}
