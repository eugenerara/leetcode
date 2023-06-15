import Questions.Easy.*;

import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
//        Question1Runnable();
//        Question9Runnable();
//        Question13Runnable();
//        Question14Runnable();
//        Question20Runnable();
        Question26Runnable();
    }

    public static void Question1Runnable() {
        Q1 question1 = new Q1();
        int[] solution = question1.twoSum(new int[] {2,7,11,15}, 9);
        System.out.println(Arrays.toString(solution));
    }

    public static void Question9Runnable() {
        Q9 question9 = new Q9();
        boolean solution = question9.isPalindrome(10);
        System.out.println(solution);
    }

    public static void Question13Runnable() {
        Q13 question13 = new Q13();
        int solution = question13.romanToInt("IV");
        System.out.println(solution);
    }

    public static void Question14Runnable() {
        Q14 question14 = new Q14();
        String solution = question14.longestCommonPrefix(new String[] {"carqwe","car","carasd"});
        System.out.println(solution);
    }

    public static void Question20Runnable() {
        Q20 question20 = new Q20();
        boolean solution = question20.isValid("()[]{}");
        System.out.println(solution);
    }

    public static void Question26Runnable() {
        Q26 question26 = new Q26();
        int solution = question26.removeDuplicates(new int[] {6,7,8,9,9,10});
        System.out.println(solution);
    }
}
