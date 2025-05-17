class Solution {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int) Math.pow(c, 0.5);

        while(left<=right){
            double left_squared = Math.pow(left, 2);
            double right_squared = Math.pow(right, 2);

            if(left_squared + right_squared == c){
                return true;
            }
            else if(left_squared + right_squared > c){
                right--;
            }
            else{
                left++;
            }
        }
        return false;
    }
}
