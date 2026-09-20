class Solution {
    public boolean canJump(int[] nums) {
        int maxNum= 0;
        for(int i = 0; i < nums.length; i++){
            if(i > maxNum){
                return false;
            }
            else{
                maxNum = Math.max(maxNum,i+nums[i]);

            }
        }
        return true;
    }
}