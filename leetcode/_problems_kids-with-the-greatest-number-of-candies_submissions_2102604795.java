import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int high = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > high) {
                high = candies[i];
            }
        }

        ArrayList<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int sum = candies[i] + extraCandies;
            if (sum >= high) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}