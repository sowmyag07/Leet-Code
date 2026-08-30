class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> running = new HashMap<>();
        for (int num : arr1) {
            running.put(num, running.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> frequency = new ArrayList<>();
        for (int num : arr2) {
            int freq = running.get(num);
            for (int i = 0; i < freq; i++) {
                frequency.add(num);
            }
            running.remove(num);
        }

        List<Integer> leftovers = new ArrayList<>(running.keySet());
        Collections.sort(leftovers);
        for (int num : leftovers) {
            int freq = running.get(num);
            for (int i = 0; i < freq; i++) {
                frequency.add(num);
            }
        }

        int[] result = new int[frequency.size()];
        for (int i = 0; i < frequency.size(); i++) {
            result[i] = frequency.get(i);
        }
        return result;
    }
}