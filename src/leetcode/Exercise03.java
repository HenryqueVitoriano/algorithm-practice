package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        // Given a string s, find the length of the longest substring without duplicate characters.

        Scanner scanner = new Scanner(System.in);

        String Frase = scanner.next();
        System.out.println(Solution(Frase));

    }
    public static int Solution(String s){
        Map<Character, Integer> MapList = new HashMap<>();
        char[] charArray = s.toCharArray();
        int value = 0;

        for (int i = 0; i < charArray.length; i++){
            if (MapList.containsKey(charArray[i])){
                value = 0;
            }else {
                MapList.put(charArray[i], i);
                value++;
            }
        }






        return 0;
    }

}
