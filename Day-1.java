//Rotate Array
class Solution {
    public void rotate(int[] nums, int k) {
        int l =nums.length-1;
        k = k%nums.length;
        rev(nums,0,l-k);
        rev(nums,l-k+1,l);
        rev(nums,0,l);
    }
    static void rev(int[] nums,int s,int e){
        while(s<=e){
            int temp = nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}
