class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int difference = target-nums[i];
            if(hashMap.containsKey(difference)){
                return new int[]{i,hashMap.get(difference)};
            }
            hashMap.put(nums[i],i);
        }
       return new int[]{}; 
    }
}