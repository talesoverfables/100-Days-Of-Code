class Solution {
    public int reverse(int x) {
        int r = Math.abs(x);
        int rem;
        int reverse1 = 0;
        int sign = 1;
    //To check if it is negative

    if(x<0){
        sign = -1;
    }
    else{
        sign = 1;
    }

        while(r>0){
            rem = r%10;
            r = r/10;
            if(reverse1 > (Integer.MAX_VALUE-rem)/10){
                return 0;
            }
            reverse1 = reverse1*10 + rem;
            
        }
        return sign*reverse1;

    }
}
