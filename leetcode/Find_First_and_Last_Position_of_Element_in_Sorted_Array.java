class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstIndex = findBound(nums, target, true);
        int lastIndex = findBound(nums, target, false);
        return new int[]{firstIndex, lastIndex};
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                result = mid; // record this as a possible answer

                if (isFirst) {
                    right = mid - 1; // keep searching left for an earlier occurrence
                } else {
                    left = mid + 1; // keep searching right for a later occurrence
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}