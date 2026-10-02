class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> brackets = new ArrayList<>();
        backtrack("", 0, 0, n, brackets);
        return brackets;
    }

    public void backtrack(String str, int openCnt, int closeCnt, int n, ArrayList<String> brackets) {

        if (str.length() == 2 * n) {
            brackets.add(str);
            return;
        }


        if (openCnt < n) {
            backtrack(str + "(", openCnt + 1, closeCnt, n, brackets);
        }


        if (closeCnt < openCnt) {
            backtrack(str + ")", openCnt, closeCnt + 1, n, brackets);
        }
    }
}