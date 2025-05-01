class Solution {
    public int maxArea(int[] height) {
        int maxheight = 0;
        int prod = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            prod = Math.min(height[left], height[right])*(right-left);
            maxheight = Math.max(maxheight, prod);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }

        }
        return maxheight;
    }
}
