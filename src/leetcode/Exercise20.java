package leetcode;

import java.util.Stack;

public class Exercise20 {
    public static void main(String[] args) {
        /*

         Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
         determine if the input string is valid.

         An input string is valid if:

            Open brackets must be closed by the same type of brackets.
            Open brackets must be closed in the correct order.
            Every close bracket has a corresponding open bracket of the same type.

         */


    }

    public static boolean Solution(String s){

        Stack<Character> characters = new Stack<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++){
            characters.push(chars[i]);
        }


    }
}
