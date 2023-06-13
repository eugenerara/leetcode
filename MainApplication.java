import Questions.Easy.Q1;

import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        Question1Runnable();
    }

    public static void Question1Runnable() {
        Q1 question1 = new Q1();
        int[] solution = question1.twoSum(new int[] {2,7,11,15}, 9);
        System.out.println(Arrays.toString(solution));
    }
}
