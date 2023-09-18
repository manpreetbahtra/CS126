/**
* A generic implementation of the IList iterface, that uses LinkElements.
*/
public class MyLinkedList<E> implements IList<E> {
    
    MyLinkedListElement<E> head;
    private int count;
    
    public MyLinkedList() {
        this.head = null;
    }
    
    // INCOMPLETE.
    public boolean isEmpty() {
        // Returns whether the list is empty.
        /*if (head == null){
            return true;
        }
        return false; */ //for milestone1
        if (size() ==0){
            return true;
        }
        return false;
    }
    
    // INCOMPLETE.
    public boolean add(E element) {
        // Adds an element to the head of the list.
        MyLinkedListElement<E> temp = new MyLinkedListElement<>(element);
        
        // if the list is not empty, point the new link to head
        if (!isEmpty()) {
            temp.setNext(head);
        }
        // update the head
        head = temp;
        count++ ; //change made here
        
        return true;
    }
    
    // INCOMPLETE.
    public int size() {
        // Returns the number of elements in stored in this list.
        // MyLinkedListElement ptr = head;
        // while (ptr!=null){
        //     count ++;
        // }
        return count;
    }
    
    // INCOMPLETE.
    public String toString() {
        // Returns a string representation of this list.

        MyLinkedListElement<E> ptr = head; //begin at the beginning
        String x= "" ;

        while(ptr != null){
	    //Process this element then set ptr to point to the next element
            x= x+ (ptr.getValue() + ", ");
            ptr = ptr.getNext();
        }
        x = x + "]";
        return x; 
    }
    
    // INCOMPLETE.
    public boolean addToTail(E element) {
        // Adds element to tail of the list
        MyLinkedListElement<E> ptr = head; 
        while (ptr.getNext() != null){
            ptr = ptr.getNext();
        }
        //now at the last item
        MyLinkedListElement<E> newNode = new MyLinkedListElement<>(element);
        newNode.setNext(null);
        ptr.setNext(newNode);//pointer of the old tail should now point to new tail
        count ++;

        return true;
    }
    
    // INCOMPLETE.
    public E removeFromHead(){
        MyLinkedListElement<E> temp = head;
        head = head.getNext();
        count--;
        return temp.getValue();
    }
    //this method returns the value of the removed item. 

    public E removeFromTail(){
        MyLinkedListElement<E> temp = head;
        //traverse the whole list
        while (temp.getNext().getNext() != null){
            temp = temp.getNext();
        }
        //now at the second last element
        temp.setNext(null);
        count--;
        return temp.getValue();
    }
    //this method returns the value of the removed item. 
    
    
    
    public E get(int index) {
        // Gets the element at index in the list
        MyLinkedListElement<E> ptr = head;
        for (int i=size()-1;i>index;i--) {
            ptr = ptr.getNext();
        }
        return ptr.getValue();
    }

    public int indexOf(E element) {
        // Gets the index of element in the list
        MyLinkedListElement<E> ptr = head;
        int i=0;
        while (ptr != null) {
            if (element.equals(ptr.getValue())) {
                return i;
            }
            i++;
            ptr = ptr.getNext();
        }
        return -1;
    }

    public E set(int index, E element) {
        // Sets element at index in the list
        MyLinkedListElement<E> ptr = head;
        for (int i=0;i<index;i++) {
            ptr = ptr.getNext();
        }
        E ret = ptr.getNext().getValue();
        MyLinkedListElement<E> newlink = new MyLinkedListElement<>(element);
        newlink.setNext(ptr.getNext().getNext());
        ptr.setNext(newlink);
        return ret;
    }
    
    public void clear() {
        // Clears the list
        head = null;
    }
    
    public boolean contains(E element) {
        // Returns whether the element exists in the list
        return indexOf(element) != -1;
    }

    public boolean remove(E element) {
        // Removes elemenet from the list
        if (isEmpty()) return false;
        MyLinkedListElement<E> ptr = head;
        while (ptr.getNext().getNext() != null) {
            if (element.equals(ptr.getNext().getValue())) {
                ptr.setNext(ptr.getNext().getNext());
                count = count-1; //change made here
                return true;
            }
            ptr = ptr.getNext();
        }
        if (element.equals(ptr.getNext().getValue())) {
            ptr.setNext(null);
            count = count -1; //change made here
            return true;
        }
        return false;
    }

    
}
