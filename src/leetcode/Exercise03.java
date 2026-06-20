package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        // Given a string s, find the length of the longest substring without duplicate characters.


        String Frase = "au";
        System.out.println(Solution(Frase));

    }

    public static int Solution(String s) {
        Map<Character, Integer> MapList = new HashMap<>();
        char[] charArray = s.toCharArray();
        int value = 0;
        int answer = 1;

        if (s.isEmpty()){
            return 0;
        }

        for (int i = 0; i < charArray.length; i++) {
            if (MapList.containsKey(charArray[i])) {
                if (answer < value) {
                    answer = value;
                    value = 0;
                }
                MapList.clear();
            }

            MapList.put(charArray[i], i);
            value++;

        }
        return value;
    }

}
