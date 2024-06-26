class Solution {
    public int getMinimumDifference(TreeNode root) {
        TreeNode curr = root;
        int prev = -1;
        int minDiff = Integer.MAX_VALUE;

        while(curr != null){

            if(curr.left == null){
                if(prev != - 1){
                    minDiff = Math.min(minDiff, curr.val - prev); 
                }
                prev = curr.val;
                curr = curr.right;
            }
            else{

                TreeNode temp = curr.left;
   
                while(temp.right != null && temp.right != curr){

                    temp = temp.right;
                }

                if(temp.right == null){
                    temp.right = curr; 
                    curr = curr.left;
                }
                else{
                    temp.right = null;
                    if(prev != - 1){
                        minDiff = Math.min(minDiff, curr.val - prev); 
                    }
                    prev = curr.val;
                    curr = curr.right;                  
                }

            }

        }

        return minDiff;
    }
}
