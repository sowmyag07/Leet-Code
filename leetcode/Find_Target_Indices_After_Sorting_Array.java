class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer>array = new ArrayList<>();
        for(int i = 0; i < nums.length;i++){
            if(target == nums[i]){
                array.add(i);
            }
        }
        return array;
    }
}