/*
     arr[] is the array
*/
class Solution {
    public static long product(long arr[]) {
        // your code here
        long product =1L;;
        
        for(int i=0;i<arr.length;i++){
            product *= arr[i];
             if (product > 1000000007) {
                product = product % 1000000007;
             }
        }
        return product;
    }
}