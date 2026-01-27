class Solution {
    static int sumOfDigits(int n) {
        // code here
        int digit=0;
        while(n>0){
            int temp = n%10;
            digit += temp;
            n = n/10;
        }
        return digit;
    }
}
