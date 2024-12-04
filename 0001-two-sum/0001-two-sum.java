class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> groupingElemetToIndexMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int requiredInteger = target - nums[i];
            if(groupingElemetToIndexMap.containsKey(requiredInteger)){
                int[] resultArray = {groupingElemetToIndexMap.get(requiredInteger), i};
                return resultArray;
            }
            groupingElemetToIndexMap.put(nums[i],i);
        }
        return null;
    }
}