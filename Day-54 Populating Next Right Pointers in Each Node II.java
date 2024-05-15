class Solution {
    public Node connect(Node root) {
        if(root ==null){
            return root;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){ 
             int size=queue.size();
            for(int i = 0; i < size; i++){
            Node ans = queue.remove();
            if(ans.left!=null){
                queue.add(ans.left);
            }
            if(ans.right!=null){
                queue.add(ans.right);
            }
            if(size-i!=1){
                ans.next = queue.peek();
            }
            }
        }

        return root;  
    }
}
