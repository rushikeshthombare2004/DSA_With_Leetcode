class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, k = 0;

        while (i < s.length() && k < t.length()) {
            if (s.charAt(i) == t.charAt(k)) {
                i++;
            }
            k++;
        }

        return i == s.length();
    }
}