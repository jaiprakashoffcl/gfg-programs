// User function Template for Java

class Solution {
    static int sumOfNaturals(int n) {
        // code here
        int sum =0;
        if(n == 0) sum += sum;
        for(int i = 1;i<=n;i++){
            sum += i;
        }
        return sum;
    }
};