class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> duplicateArray = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(duplicateArray.containsKey(nums[i])){
                return true;
            }
            duplicateArray.put(nums[i], i);
        }
        return false;   
    }
}