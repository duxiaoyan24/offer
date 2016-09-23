package intelligence;

/**
 * Created by BFD_308 on 2016/9/22.
 */
public class Solution19 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public void Mirror(TreeNode root) {
        if (root == null) return;
        if (root.left == null && root.right == null) return;

        TreeNode tmp = null;
        tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        if (root.left != null) Mirror(root.left);
        if (root.right != null) Mirror(root.right);
    }

    // 两个函数有什么不同？
    public void MMirror_error(TreeNode root) {
        if (root == null) return;

        TreeNode tmp = null;
        if (root.left != null && root.right != null) {
            tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            Mirror(root.left);
            Mirror(root.right);
        } else if (root.left != null && root.right == null) {
            tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            Mirror(root.left);
        } else if (root.left == null && root.right != null) {
            tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            Mirror(root.right);
        } else {
            return;
        }


    }
}
