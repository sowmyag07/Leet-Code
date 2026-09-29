class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> count = new HashMap<>();

        for(int num:nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }

        int[] result = new int[k];
        int index = 0;

        while(index < k){
            int maxFreq = 0;
            int maxNum = 0;

            for(int num : count.keySet()){
                if(count.get(num) > maxFreq){
                    maxFreq = count.get(num);
                    maxNum = num;
                }
            }

            result[index] = maxNum;
            index++;
            count.remove(maxNum);
        }

        return result;
    }
}