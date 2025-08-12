class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put(')','(');
        hashMap.put('}','{');
        hashMap.put(']','[');
        if(s.length()<2){
            return false;
        }
        for(char ch : s.toCharArray()){
            if(!hashMap.containsKey(ch)){
                stack.push(ch);
            }
            else{
                char poppedElement = (stack.isEmpty())?'*':stack.pop();
                if(hashMap.get(ch)!=poppedElement){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}