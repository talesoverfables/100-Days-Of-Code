class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] answer = new int[nums.length];
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            int left = i-1;
            int right = i+1;
            leftSum[i] = 0;
            rightSum[i] = 0;
            //Left Sum
            for(int j = 0; j<=left; j++){
                leftSum[i] = leftSum[i] + nums[j];
            }
            //Right Sum
            for(int k = right; k<=nums.length-1; k++){
                rightSum[i] = rightSum[i] + nums[k];
            }
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);

        }

        return answer;
    }
}
