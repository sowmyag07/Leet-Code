class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i = 0 ; i < n ; i ++){
            if((n > 0 ) && (n & (n - 1))==0){
                return true;
            }
            else{
                return false;
            }
        }
        return ((n >0) && (n & (n-1))==0);
    }
}