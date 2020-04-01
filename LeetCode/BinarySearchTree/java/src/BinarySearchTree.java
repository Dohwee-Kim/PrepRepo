/**
 * BST : Recursive way  ! RETRY
 */

public class BinarySearchTree {

    private static Node root;
    private static Node one = new Node(1);
    private static Node two = new Node(2);
    private static Node three = new Node(3);
    private static Node four = new Node(4);
    private static Node five = new Node(5);
    private static Node six = new Node(6);
    private static Node seven = new Node(7);




    public static void main(String[] args) {
        //build a BST
        /*
        four.left = two;
        four.right = six;
        two.left = one;
        two.right = three;
        six.left = five;
        six.right = seven;
        root = four;

        System.out.println( search(root, 3));
        System.out.println( search(root, 11) );  */

        insert(root,4);
        insert(root,2);
        insert(root,1);
        insert(root,3);
        insert(root,6);
        insert(root,5);
        insert(root,7);

        inorder();

        delete(7);

        inorder();

    }

    //Search
    public static Node search(Node root, int key) {
        if ( root == null || root.data == key ) { //break condition
            return root;
        }


        if (root.data > key) {
            return search(root.left, key);
        }

        else  {
            return search(root.right, key);
        }

    }

    //insert
    public static Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (root.data > data) {
            return insert(root.left, data);
        }
        else {
            return insert(root.right, data);
        }
    }

    //deletion

    public static void delete(int data){
        root = delete(root, data);
    }
    public static Node delete(Node root, int data){
        if (root == null) return root;
        if (data < root.data) {
            root.left = delete(root.left, data);
        }
        else if (data > root.data) {
            root.right = delete(root.right,data);
        }
        else {
            if(root.left == null && root.right == null ) return null;
            else if (root.left == null ) return root.right;
            else if (root.right == null ) return root.left;
            else {
                root.data = findMin(root.right);
                root.right = delete(root.right, root.data);
            }
        }
        return root;
    }

    public static int findMin(Node root ) {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }


    public static void inorder(){
        inorder(root);
        System.out.println("");
    }
    public static void inorder(Node root) {
        if( root != null ){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}
