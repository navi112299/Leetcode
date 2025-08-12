class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultArray = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        if(n<3){
            return resultArray;
        }
        for(int a=0; a<n-2; a++){
            if(a==0 || nums[a]!=nums[a-1]){
                int b=a+1, c=n-1;
                while(b<c){
                    int sum = nums[a] + nums[b] + nums[c];
                    if(sum<0){
                        b++;
                    }
                    else if(sum>0){
                        c--;
                    }
                    else{
                        resultArray.add(Arrays.asList(nums[a], nums[b], nums[c]));
                        b++;
                        c--;
                        while(b<c && nums[b]==nums[b-1]){
                            b++;
                        }
                        while(b<c && nums[c]==nums[c+1]){
                            c--;
                        }
                    }
                }
            }
        }
        return resultArray;
        
    }
}