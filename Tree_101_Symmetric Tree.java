class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
	            return true;
	        return isEqual(root.left,root.right);
        }
        private boolean isEqual(TreeNode l,TreeNode r) {  //写一个判断左右节点的函数
            if(l == null && r == null)
                return true;
            
            while(l != null && r != null){
                
                return((l.val == r.val) && isEqual(l.left,r.right) && isEqual(l.right,r.left));
                    
            }
                return false;
    }
}
