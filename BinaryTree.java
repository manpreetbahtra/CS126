public class BinaryTree<E extends Comparable<E>> {
    BinaryTreeNode<E> root;

    public BinaryTree() {
        root = null;
    }

    private void addToSubTree(BinaryTreeNode<E> n, E v) {    
        if (n!=null) // sanity check!
        {
            E nValue = n.getValue();
            if (v.compareTo(nValue) <= 0) {
                System.out.println("Adding "+v+" to left sub-tree of "+nValue);
                if (n.getLeft()==null)
                    n.setLeft(new BinaryTreeNode<>(v));
                else
                    addToSubTree(n.getLeft(), v);
            }
            else {
                System.out.println("Adding "+v+" to right sub-tree of "+nValue);
                if (n.getRight()==null)
                    n.setRight(new BinaryTreeNode<>(v));
                else
                    addToSubTree(n.getRight(), v);
            }
        }
    }

    public void add(E v) {
        if (root==null) {
            System.out.println("Adding "+v+" to root.");
            root = new BinaryTreeNode<>(v);
        }
        else
            addToSubTree(root, v);
    }

    //print items in descending order - so did right root left
    private void inOrder(BinaryTreeNode<E> n) {
        if (n!=null) {
            inOrder(n.getRight());
            System.out.print(((Integer)n.getValue()).intValue()+" ");
            inOrder(n.getLeft());
        }
    }

    //print items in the ascending order- left root right
/*     private void inOrder(BinaryTreeNode<E> n) {
        if (n!=null) {
            inOrder(n.getLeft());
            System.out.print(((Integer)n.getValue()).intValue()+" ");
            inOrder(n.getRight());
        }
    } */

    // INCOMPLETE.
    private void preOrder(BinaryTreeNode<E> n)
    {
        // this method is to be completed...
        if (n!=null) {
            System.out.print(((Integer)n.getValue()).intValue()+" ");
            preOrder(n.getLeft());
            preOrder(n.getRight());
        }
    }

    // INCOMPLETE. - left right root
    private void postOrder(BinaryTreeNode<E> n)
    {
        // this method is to be completed...
        if (n!=null) {
            postOrder(n.getLeft());
            postOrder(n.getRight());
            System.out.print(((Integer)n.getValue()).intValue()+" ");
        }
    }

    public void traversal()
    {
        System.out.print("Inorder traversal: ");

        inOrder(root);

        System.out.println();

        System.out.print("Preorder traversal: ");

        preOrder(root);

        System.out.println();

        System.out.print("Postorder traversal: ");

        postOrder(root);

        System.out.println();
    }
}
