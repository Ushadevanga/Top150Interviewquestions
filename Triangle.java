class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        // Start from the second last row and move upwards
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int minSum = Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
                int currentVal = triangle.get(i).get(j);
                triangle.get(i).set(j, currentVal + minSum);
            }
        }
        return triangle.get(0).get(0);
    }
}
