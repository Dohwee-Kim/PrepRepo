//Q : https://leetcode.com/problems/count-complete-tree-nodes/

class Solutions {

    public static TreeNode root = new TreeNode(1);
    public static TreeNode leaf1 = new TreeNode( 2 );
    public static TreeNode leaf2 = new TreeNode( 3 );
    public static TreeNode leaf3 = new TreeNode(4);


    public static void main(String[] args) {
        root.left = leaf1;
        root.right = leaf2;
        leaf1.left = leaf3;

        System.out.println( recursivelyCountNodes(root) );

    }

    public static int recursivelyCountNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        else {
            return recursivelyCountNodes( root.left ) + recursivelyCountNodes( root.right ) + 1;
        }
    }

}
