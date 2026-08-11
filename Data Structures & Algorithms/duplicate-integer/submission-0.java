class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for(int i: nums) {
            set.add(i);
        }
        return set.size() != nums.length;
    }
}