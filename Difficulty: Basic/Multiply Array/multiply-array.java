
class Solution {

    public static int product(int arr[], int n) {
        int x =1;
        for(int i=0;i<n;i++){
            x *= arr[i];
        }
        
        return x;
    }
}
