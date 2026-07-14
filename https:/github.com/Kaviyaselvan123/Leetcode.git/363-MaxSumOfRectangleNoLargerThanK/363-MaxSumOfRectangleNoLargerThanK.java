// Last updated: 7/14/2026, 2:05:24 PM
class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int answer = Integer.MIN_VALUE;
        for (int left = 0; left < cols; left++) {
            int[] temp = new int[rows];
            for (int right = left; right < cols; right++) {
                for (int r = 0; r < rows; r++) {
                    temp[r] += matrix[r][right];
                }
                TreeSet<Integer> set = new TreeSet<>();
                set.add(0);
                int prefix = 0;
                for (int val : temp) {
                    prefix += val;
                    Integer target =
                            set.ceiling(prefix - k);
                    if (target != null) {
                        answer = Math.max(
                                answer,
                                prefix - target
                        );
                    }
                    set.add(prefix);
                }
            }
        }
        return answer;
    }
}