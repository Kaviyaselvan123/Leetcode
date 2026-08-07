// Last updated: 8/7/2026, 12:26:57 PM
1class Solution {
2    private int nextIndex(int[] nums, int current, boolean forward) {
3        boolean direction = nums[current] >= 0;
4        if (direction != forward) {
5            return -1;
6        }
7        int n = nums.length;
8        int next = ((current + nums[current]) % n + n) % n;
9        if (next == current) {
10            return -1;
11        }
12        return next;
13    }
14    public boolean circularArrayLoop(int[] nums) {
15        int n = nums.length;
16        for (int i = 0; i < n; i++) {
17            boolean forward = nums[i] >= 0;
18            int slow = i;
19            int fast = i;
20            while (true) {
21                slow = nextIndex(nums, slow, forward);
22                if (slow == -1) break;
23                fast = nextIndex(nums, fast, forward);
24                if (fast == -1) break;
25                fast = nextIndex(nums, fast, forward);
26                if (fast == -1) break;
27                if (slow == fast) {
28                    return true;
29                }
30            }
31        }
32        return false;
33    }
34}