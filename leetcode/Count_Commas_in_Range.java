class Solution {
    public int countCommas(int n) {
        int totalCommas = 0;

        for (int i = 1; i <= n; i++) {
            int temp = i;
            int digitCount = 0;

            while (temp != 0) {
                temp = temp / 10;
                digitCount++;
            }

            int commas = (digitCount - 1) / 3;
            totalCommas = totalCommas + commas;
        }

        return totalCommas;
    }
}