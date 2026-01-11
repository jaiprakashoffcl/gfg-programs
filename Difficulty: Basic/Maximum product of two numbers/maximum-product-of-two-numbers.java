
class Solution {
    public static int maxProduct(int[] arr) {
        // code here
         Arrays.sort(arr);
         int x = arr.length;
        return (arr[x-1])*(arr[x-2]);
    }
}
