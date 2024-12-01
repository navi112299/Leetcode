class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> strMap = new HashMap<>();
        for(String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if(!strMap.containsKey(sortedWord)){
                strMap.put(sortedWord, new ArrayList<>());
            }
            strMap.get(sortedWord).add(word);
        }
        return new ArrayList<>(strMap.values());
    }
}