class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum1 = 0;
        for(int i = 1; i<=(int)num/2; i++){
            if(num%i == 0){
                sum1 = sum1 + i;
            }

        }
        if(sum1 == num){
            return true;
        }
        return false;
    }
}
