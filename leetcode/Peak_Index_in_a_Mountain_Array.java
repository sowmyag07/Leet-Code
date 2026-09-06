class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0; 
        int right = arr.length -1;
        while(left < right){
            int mid = (left + right) /2;//1
            if(arr[mid] < arr[mid + 1]){
                left = mid +1;//1 < 2
            }
            if(arr[mid] > arr[mid + 1]){
                right = mid;
                //1 > 2
            }
        }
        return left;

    }
}