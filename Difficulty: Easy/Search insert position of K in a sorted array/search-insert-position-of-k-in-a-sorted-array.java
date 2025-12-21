class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int x =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == k){
                x=i;
            }
            else{
                if(k>arr[i]){
                    x =i+1;
                }
            }
        }
        return x;
    }
};