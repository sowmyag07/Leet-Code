class Solution {
    public boolean checkIfPangram(String sentence) {
        int total[] = new int[26];
        for(int i =0; i < sentence.length(); i++){
            char ch= sentence.charAt(i);
            total[ch-'a']++;

        }
        for(int i = 0; i < 26; i++){
            if(total[i]==0){
                return false;
            }
        }
        return true;
        
    }
}