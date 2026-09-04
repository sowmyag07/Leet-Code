class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        while(left < right){
            int mid = (left + right) /2;//1//2
            if(nums[mid] < nums[mid + 1]){//1 < 2;//2 < 3
                left = mid +1;//
            }
            if(nums[mid] > nums[mid +1]){//1 > 2
                right = mid;
            }

        }
        return left;
    }
}