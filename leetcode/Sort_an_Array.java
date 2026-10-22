class Solution {
    public int[] sortArray(int[] nums) {
        int offset = 50000;
        int[] count = new int[100001];


        for (int i = 0; i < nums.length; i++) {
            count[nums[i] + offset]++;
        }


        int idx = 0;
        for (int v = 0; v < count.length; v++) {
            while (count[v] > 0) {
                nums[idx] = v - offset;
                idx++;
                count[v]--;
            }
        }

        return nums;
    }
}