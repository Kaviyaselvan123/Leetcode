// Last updated: 7/23/2026, 12:36:10 PM
1class Solution {
2    public String customSortString(String order, String s) {
3        int[] freq = new int[26];
4        for (char c : s.toCharArray()) {
5            freq[c - 'a']++;
6        }
7        StringBuilder ans = new StringBuilder();
8        for (char c : order.toCharArray()) {
9            while (freq[c - 'a'] > 0) {
10                ans.append(c);
11                freq[c - 'a']--;
12            }
13        }
14        for (int i = 0; i < 26; i++) {
15            while (freq[i] > 0) {
16                ans.append((char)('a' + i));
17                freq[i]--;
18            }
19        }
20        return ans.toString();
21    }
22}