class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupingIndividualAnagram = new HashMap<>();
        for(String individualWord : strs){
            char[] wordToCharacterArray = individualWord.toCharArray();
            Arrays.sort(wordToCharacterArray);
            String sortedWord = new String(wordToCharacterArray);
            if(!groupingIndividualAnagram.containsKey(sortedWord)){
                groupingIndividualAnagram.put(sortedWord, new ArrayList<>());
            }
            groupingIndividualAnagram.get(sortedWord).add(individualWord);
        }
        return new ArrayList<>(groupingIndividualAnagram.values());
    }
}