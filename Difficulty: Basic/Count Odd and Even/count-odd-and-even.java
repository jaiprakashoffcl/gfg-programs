class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int[] count = new int[2];
        int oddcount=0;
        int evencount =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        count[0] = oddcount;
        count[1] = evencount;
            
        return count;
    }
}