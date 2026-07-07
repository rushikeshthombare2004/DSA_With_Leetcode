class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long s = 0;

        String str = Integer.toString(n);

        for (char c : str.toCharArray()) {
            if (c != '0') {
                x = x * 10 + (c - '0');
                s += (c - '0');
            }
        }

        return x * s;
    }
}