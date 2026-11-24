class Solution {
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public int maxLength(int[] nums) {
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            long prod = 1;
            int g = 0;
            int l = 1;
            for (int j = i; j < nums.length; j++) {
                prod = prod * nums[j];
                g = gcd(g, nums[j]);
                l = l / gcd(l, nums[j]) * nums[j];

                if (prod > 30000) {
                    break;
                }
                if (prod == (long) l * g) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
}