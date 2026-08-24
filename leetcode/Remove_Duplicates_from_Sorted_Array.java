class Solution {
    public int removeDuplicates(int[] nums) {
        int values = 0;
        for (int notValues = 1; notValues < nums.length; notValues++) {
            if (nums[values] == nums[notValues]) {
                // duplicate, do nothing
            } else {
                values += 1;
                nums[values] = nums[notValues];
            }
        }
        return values + 1;
    }
}