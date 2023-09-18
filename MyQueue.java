public class MyQueue<E> implements IQueue<E> {

    private ListElement<E> head;
    private ListElement<E> tail;

    public MyQueue() {
        head = null;
        tail = null;
    }
    
    public boolean isEmpty() {
        return (head == null);
    }

    public E dequeue() {
        if (isEmpty()) {
            return null;
        }

        ListElement<E> tmp = head;
        head = tmp.getNext();

        if (head == null) {
            tail = null;
        }     
        return tmp.getValue();
    }

    public void enqueue(E value) {
        ListElement<E> tmp = new ListElement<>(value);

        if (isEmpty()) {
            tail = head = tmp;
        } else {
            tail.setNext(tmp);
            tail = tmp;
        }
        
    }

    public String toString(){
        ListElement<E> tmp = head;
        String toReturn="[";
        while (tmp != null){
            toReturn += tmp.getValue();
            tmp=tmp.getNext();
        }
        toReturn += " ]";
        return toReturn;
    }

    public void modifyHead(E value){
        ListElement<E> tmp = new ListElement<>(value);
        if (isEmpty()){
            head = tmp;
            tail=tmp;
        }else {
            ListElement<E> nextElementPointer= head.getNext();
            head = tmp;
            head.setNext(nextElementPointer);
        }
    }
}