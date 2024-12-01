class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int requiredInteger = target - nums[i];
            if(numMap.containsKey(requiredInteger)){
                int[] arr = {numMap.get(requiredInteger), i};
                return arr;
            }
            numMap.put(nums[i],i);
        }
        return null;
    }
}