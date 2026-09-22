class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 0;
        int count =0;
        int num =1;
        while(true){
            if(i < arr.length && arr[i] == num){
                i++;
                num++;

            }
            else{
                count++;
                if(count == k){
                    return num;
                }
                num++;
            }

        }



    }
}