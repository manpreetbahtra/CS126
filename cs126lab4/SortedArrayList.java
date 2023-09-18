public class SortedArrayList<E extends Comparable<E>> extends ArrayList<E> {
    
    public SortedArrayList() {
        super();
    }

    // INCOMPLETE.
/* Method to add element to the list, inserted in the correct place for the ordering of E.
get(i).compareTo() compares the item found while looping to the input element that was passed in.
If the list is not empty, the new element is added to the end of the list. The for loop then iterates 
over the elements of the list in reverse order, starting from the second-to-last element (since 
the last element is the new element that was just added). In each iteration, the code checks 
whether the element at the current index is greater than the element at the next index using 
the compareTo method. If the current element is greater than the next element, this means they 
are out of order, swap them. Continues swapping until it reaches first element or until it 
encounters a pair of adjacent elements that are in the correct order. */

    public boolean add(E element) {
        if (this.isEmpty()){
            return super.add(element);
        }
        
        //finds the position of where the new element should be added
        int position =0;
        E item = this.get(position);
        while(position < this.size() && element.compareTo(item) >0){
            //element is bigger move right
            position++;
            item=this.get(position);
        }
        //found the change in sign- means element needs to be added here
        if (position ==this.size()){
            //if its the last position i can add it using the super add method
            super.add(element);
        } else {
            E temp = this.get(position); //store the item which is stored at where element needs to be stored
            //set that position to have the element
            this.set(position, element);
        

            //shuffles items including and after position 
            for (int i= (position +1); i < this.size(); i++){
                E temp2 = this.get(i);
                this.set(i, temp);
                temp = temp2;
            }

            this.add(temp);
        }
        return super.contains(element); // This will mean elements are stored in the order that they were added
    }



    // INCOMPLETE.
//order of data doesnt affect it. 
// The greater the number of elements in the list, the greater the number of comparisons.
//Since it uses a for loop and iterates over all the elements in the list, if the item to be 
//searched for is the last element or doesnt exist it would go through all the n elements. 
//returns the number of comparisons required to find element using Linear Search.
    public int findLinear(E element) {
        int comparisons =0;
        for (int i =0; i<super.size(); i++){
            comparisons++;
            if (element.equals(super.get(i))){  //this.get(i) == element
                return comparisons;
            }
        }
        return -1;
    }
    
    // INCOMPLETE. comparisons needed on average - log 2 n 
    //use linear- when list is small and data unsorted. 
    //use binary- data sorted.
    public int findBinary(E element) {
        //returns the number of comparisons required to find element using Binary Search.
        int comparisons =0;
        int low =0;
        int high = super.size()-1;

        while (low<=high ){
            int mid = (low + high) /2;
            comparisons ++;
            if (super.get(mid) == element){
                return comparisons;
            } else if (super.get(mid).compareTo(element) < 0){
                //if the midpoint is smaller 
                low = mid +1;
            }else {
                //midpoint is greater than element to be searched for
                high = mid -1;
            }
        }
        return comparisons;
    }
    
}
