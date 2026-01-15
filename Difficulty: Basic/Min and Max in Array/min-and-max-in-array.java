class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        
        int min= arr[0];
        int max = arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
            
            if(max<arr[i]){
                max = arr[i];
            }
        }
        list1.add(min);
        list1.add(max);
        return list1;
    }
}
