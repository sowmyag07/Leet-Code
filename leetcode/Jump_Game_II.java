class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int  current =0;
        int movingNum = 0;

        for(int i = 0; i < nums.length-1;i++){
            movingNum = Math.max(movingNum,i+nums[i]);
            if(i == current){
                jump++;
                current = movingNum;
            }

        }
        return jump;
    }
}