class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (n != m) {
            return false;
        }
        HashMap<Character, Integer> ss = new HashMap<>(n);
        HashMap<Character, Integer> tt = new HashMap<>(m);

        for (int i = 0; i < n; i++) {
            ss.put(s.charAt(i), ss.getOrDefault(s.charAt(i), 0) + 1);
            tt.put(t.charAt(i), tt.getOrDefault(t.charAt(i), 0) + 1);
        }

        return ss.equals(tt);
    }
}
