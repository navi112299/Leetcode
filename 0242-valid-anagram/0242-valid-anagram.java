class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] alphabetsArray = new int[26];
        for(int i=0; i<s.length(); i++){
            alphabetsArray[s.charAt(i) - 'a']++;
            alphabetsArray[t.charAt(i) - 'a']--;
        }    
        for(int i : alphabetsArray){
            if(i != 0){
                return false;
            }
        }
        return true;
        
    }
}