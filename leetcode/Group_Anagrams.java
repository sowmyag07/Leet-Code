class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mpp = new HashMap<>();
        
        for (String word : strs) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            
            List<String> group = mpp.getOrDefault(key, new ArrayList<>());
            group.add(word);
            mpp.put(key, group);
        }
        
        return new ArrayList<>(mpp.values());
    }
}