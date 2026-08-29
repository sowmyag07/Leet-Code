import java.util.*;

class Solution {
    public int[] findErrorNums(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of every number
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int duplicate = 0;
        int missing = 0;

        // Numbers should be from 1 to n
        for (int i = 1; i <= nums.length; i++) {

            if (map.getOrDefault(i, 0) == 2) {
                duplicate = i;
            }

            if (map.getOrDefault(i, 0) == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }
}