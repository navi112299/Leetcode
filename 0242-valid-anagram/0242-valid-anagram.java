class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] alphabetsArr = new int[26];
        for(int i=0; i<s.length(); i++){
            alphabetsArr[s.charAt(i) - 'a']++;
            alphabetsArr[t.charAt(i) - 'a']--;
        }    
        for(int i : alphabetsArr){
            if(i != 0){
                return false;
            }
        }
        return true;
        
    }
}