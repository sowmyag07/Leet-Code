












class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            long n = nums[i];
            if (n == first || n == second || n == third) {
                continue;
            }
            if (n > first) {
                third = second;
                second = first;
                first = n;
            } else if (n > second) {
                third = second;
                second = n;
            } else if (n > third) {
                third = n;
            }
        }
        if (third == Long.MIN_VALUE) {
            return (int) first;
        } else {
            return (int) third;
        }
    }
}