package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        // Given a string s, find the length of the longest substring without duplicate characters.


        String Frase = "abcabcbb";
        System.out.println(Solution(Frase));

    }

    public static int Solution(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int answer = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            if (map.containsKey(current)) {
                left = Math.max(left, map.get(current) + 1);
            }

            map.put(current, right);

            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}

