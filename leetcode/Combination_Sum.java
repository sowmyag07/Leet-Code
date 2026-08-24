import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();
        backtrack(candidates, target, 0, currentCombination, result);
        return result;
    }

    private void backtrack(int[] candidates, int remaining, int index,
                            List<Integer> currentCombination, List<List<Integer>> result) {


        if (remaining == 0) {
            result.add(new ArrayList<>(currentCombination)); 
            return;
        }


        if (remaining < 0) {
            return;
        }


        if (index >= candidates.length) {
            return;
        }


        currentCombination.add(candidates[index]);
        backtrack(candidates, remaining - candidates[index], index, currentCombination, result);
        currentCombination.remove(currentCombination.size() - 1);


        backtrack(candidates, remaining, index + 1, currentCombination, result);
    }
}