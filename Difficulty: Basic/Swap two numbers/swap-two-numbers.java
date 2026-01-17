class Solution {
    static List<Integer> get(int a, int b) {
        // code here
        ArrayList<Integer> List = new ArrayList<>();
        
        
        a = a+b;
        b = a-b;
        a = a-b;
        
        List.add(a);
        List.add(b);
        
        return List;
        
    }
}