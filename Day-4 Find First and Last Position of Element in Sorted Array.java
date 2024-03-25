class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] list = {-1,-1};
        list[0] = search(nums,target,true);
        list[1] = search(nums,target,false);
        return list;
    }
    static int search(int[] nums,int target,boolean find){
        int s=0,e=nums.length-1,result=-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m]==target){
                result=m;
                if(find){
                    e=m-1;
                }else{
                    s=m+1;
                }
            }else if(nums[m]>target){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return result;
    }
}
