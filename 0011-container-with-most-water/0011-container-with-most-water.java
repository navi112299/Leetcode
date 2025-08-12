class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int start = 0;
        int end = height.length-1;
        while(start<end){
            int width = end-start;
            maxArea = Math.max(maxArea, Math.min(height[start], height[end])*width);
            if(height[start]<=height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return maxArea;
        
    }
}