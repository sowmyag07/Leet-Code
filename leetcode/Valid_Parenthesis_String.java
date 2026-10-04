class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> openbracket = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openbracket.push(i);
            } else if (s.charAt(i) == '*') {
                star.push(i);
            } else {
                if (!openbracket.isEmpty()) {
                    openbracket.pop();
                } else if (!star.isEmpty()) {
                    star.pop();
                } else {
                    return false;
                }
            }
        }


        while (!openbracket.isEmpty() && !star.isEmpty()) {
            if (openbracket.peek() > star.peek()) {
                return false;
            }
            openbracket.pop();
            star.pop();
        }

        return openbracket.isEmpty();
    }
}