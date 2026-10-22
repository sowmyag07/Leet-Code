class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        while(true){
            int X = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i ++){
                if(nums[i] > 0 && nums[i] < X){
                    X = nums[i];
                }
            }
            if(X== Integer.MAX_VALUE){
                break;
            }
            for(int i = 0; i < nums.length;i++){
                if(nums[i] > 0){
                    nums[i]= nums[i] - X;
                }
            }
            count++;



        }
        return count;
    }
}