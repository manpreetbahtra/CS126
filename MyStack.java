public class MyStack<E> implements IStack<E> {


    private DoublyLinkedList<E> doubly = new DoublyLinkedList<>();

    // INCOMPLETE.
    public void push(E val) {
        //  TODO: implement pushing
        doubly.addToTail(val);
    }

    // INCOMPLETE.
    public E pop() {
        //  TODO: implement popping
        return doubly.removeFromTail();
    }

    // INCOMPLETE
    public boolean isEmpty() {
        //  TODO: check whether list is empty
        return doubly.isEmpty();
    }
}
