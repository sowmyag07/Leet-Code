class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        //creating a new array with same values but empty .
        Arrays.sort(expected);
        int count =0; 
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != expected[i]){

                count ++;
            }
        }
        return count;
    }
}