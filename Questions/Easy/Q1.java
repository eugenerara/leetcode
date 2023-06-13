package Questions.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 */
public class Q1 {
    public int[] twoSum(int[] nums, int target) {
        //Map to store the key as the difference between the target and the value on an index, and the value as the position
        Map<Integer, Integer> targetMapping = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            //Check if target difference exists in map, and return position if true
            if (targetMapping.containsKey(nums[index])) {
                return new int[] {targetMapping.get(nums[index]), index};
            }
            //Add difference and index to Map
            targetMapping.put(target-nums[index], index);
        }
        throw new IllegalStateException("Invalid State");
    }
}
