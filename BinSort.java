/**
*   Sorting integers using a binary tree
*/
public class BinSort {
    public static void main(String[] args) {
        BinaryTree<Integer> t = new BinaryTree<>();
        
        t.add(2);
        t.add(4);
        t.add(1);
        t.add(5);
        t.add(3);

        t.traversal();
    }
}
