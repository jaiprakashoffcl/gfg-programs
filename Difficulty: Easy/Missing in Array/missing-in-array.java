class Solution {
    int missingNum(int arr[]) {
        // code here
        int actualsum=0;
        int expectedsum=0;
        
        for(int i=0;i<arr.length;i++){
            actualsum += arr[i];
        }
        
        for(int j=1;j<=arr.length+1;j++){
            expectedsum += j;
        }
        return expectedsum-actualsum;
    }
}