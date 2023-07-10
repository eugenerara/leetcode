import Questions.Easy.*;
import Questions.Practice.SGPools;
import Questions.Practice.TestDome;

import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
//        Question1Runnable();
//        Question9Runnable();
//        Question13Runnable();
//        Question14Runnable();
//        Question20Runnable();
//        Question26Runnable();
//        TestDomeQuestion();
//        Question27Runnable();
//        Question28Runnable();
//        Question35Runnable();
//        Question58Runnable();
        sgPoolsRunnable();
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

    public static void TestDomeQuestion() {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", TestDome.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }

    public static void Question27Runnable() {
        Q27 question27 = new Q27();
        int solution = question27.removeElement(new int[] {0,1,2,2,3,0,4,2}, 2);
        System.out.println(solution);
    }

    public static void Question28Runnable() {
        Q28 question28 = new Q28();
        int solution = question28.firstOccurringIndex("abc", "c");
        System.out.println(solution);
    }

    public static void Question35Runnable() {
        Q35 question35 = new Q35();
        int solution = question35.searchInsert(new int[]{1,3,5}, 5);
        System.out.println(solution);
    }

    public static void Question58Runnable() {
        Q58 question58 = new Q58();
        int solution = question58.lengthOfLastWord("Hello World");
        System.out.println(solution);
    }

    public static void Question66Runnable() {
        Q66 question66 = new Q66();
        int[] solution = question66.plusOne(new int[]{4,3,2,1});
        System.out.println(Arrays.toString(solution));
    }

    public static void sgPoolsRunnable() {
        SGPools sgPools = new SGPools();
        String solution = sgPools.hideString("123-456-789-0", 5, '*', '-');
        System.out.println(solution);

    }
}
