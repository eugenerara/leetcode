package Questions.Easy;

public class Q27 {
    public int removeElement(int[] nums, int val) {
        int i = 0;

        for (final int num : nums) {
            if (num != val) {
                nums[i++] = num;
            }
        }

        return i;
    }
}
