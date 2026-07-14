// Last updated: 7/14/2026, 2:06:08 PM
class Solution {

    int[] memo;

    public int decode(String s, int i) {

        if (i == s.length()) {
            return 1;
        }

        if (s.charAt(i) == '0') {
            return 0;
        }

        if (memo[i] != -1) {
            return memo[i];
        }

        int ways = decode(s, i + 1);

        if (i < s.length() - 1) {

            int num = (s.charAt(i) - '0') * 10
                    + (s.charAt(i + 1) - '0');

            if (num >= 10 && num <= 26) {
                ways += decode(s, i + 2);
            }
        }

        memo[i] = ways;
        return ways;
    }

    public int numDecodings(String s) {

        memo = new int[s.length()];

        for (int i = 0; i < memo.length; i++) {
            memo[i] = -1;
        }

        return decode(s, 0);
    }
}