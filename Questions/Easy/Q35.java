package Questions.Easy;

public class Q35 {
    public int searchInsert(int[] nums, int target) {
        //If 1st number is less than target
        if (nums[0] >= target)
            return 0;

        for (int i = 1; i < nums.length; i++) {
            // if target is found
            if (nums[i-1] == target)
                return i-1;
            // target is not found
            if (nums[i-1] < target && nums[i] > target) {
                return i;
            }
            if (i == nums.length-1) {
                return target > nums[i] ? nums.length: i;
            }
        }
        return nums[0] < target ? 1 : -1;
    }
}
