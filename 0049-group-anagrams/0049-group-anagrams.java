class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram = new HashMap<>();
        for(String words:strs){
            char[] chars = words.toCharArray();
            Arrays.sort(chars);
            String word = new String(chars);
            if(!anagram.containsKey(word)){
                anagram.put(word, new ArrayList<>());
            }
            anagram.get(word).add(words);
        }
        return new ArrayList<>(anagram.values());
    }
}