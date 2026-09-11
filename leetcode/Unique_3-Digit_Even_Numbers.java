class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer>unique =new HashSet<>();

        for(int i = 0; i < digits.length;i++){
            for(int j = 0; j < digits.length;j++){
                for(int k =0; k < digits.length; k++){
                    if(i !=j && j!=k && k !=i){
                        if(digits[i] != 0 && digits[k] %2 == 0){
                            int total = digits[i] * 100 + digits[j] * 10 + digits[k];
                            unique.add(total);

                        }
                    }
                }
            }
        }
        return unique.size();

    }
}