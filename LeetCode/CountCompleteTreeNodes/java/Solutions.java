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
        System.out.println( improvedCountNodes(root) );

    }

    public static int recursivelyCountNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        else {
            return recursivelyCountNodes( root.left ) + recursivelyCountNodes( root.right ) + 1;
        }
    }

    public static int improvedCountNodes(TreeNode root) {
        int leftHeight=0 , rightHeight = 0;
        TreeNode leftNodePointer = root;
        TreeNode rightNodePointer = root; // Pointers

        while( leftNodePointer != null ) {
            leftHeight++;
            leftNodePointer = leftNodePointer.left;
        }

        while( rightNodePointer != null ) {
            rightHeight++;
            rightNodePointer = rightNodePointer.right; 
        }

        if (leftHeight == rightHeight){
            return (int)Math.pow(2, leftHeight) - 1 ;
        }

        else {
            return improvedCountNodes(root.left) + improvedCountNodes(root.right) + 1;
        }
    }

}
