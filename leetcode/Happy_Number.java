import java.util.*;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumOfSquaredDigits(n);
        }

        return n == 1;
    }

    private int sumOfSquaredDigits(int num) {
        int result = 0;
        while (num != 0) {
            int digit = num % 10;
            result = result + digit * digit;
            num = num / 10;
        }
        return result;
    }
}