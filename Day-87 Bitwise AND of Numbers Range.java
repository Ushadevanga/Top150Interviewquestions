class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        // Shift left and right until they are equal
        while (left < right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }
        // Shift back the common prefix
        return left << shift;
    }
}
