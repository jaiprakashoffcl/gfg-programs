class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            if (set.contains(x)) {
                list.add(x);
            } else {
                set.add(x);
            }
        }

        return list;
    }
}