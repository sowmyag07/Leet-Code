class Solution {
    public boolean isValid(String s) {
        char[]  inputChar = s.toCharArray();
        Map<Character,Character>map =new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character>stack = new Stack<>();
        for(Character maps: inputChar){
            if(map.containsKey(maps)){
                stack.push(maps);
            }
            else{
                if(stack.empty() || maps != map.get(stack.pop())){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}