/**
* A generic implementation of the IList iterface.
*/
import java.io.IOException;

public class Set<E> implements ISet<E> {
    
    private MyArrayList<E> array = new MyArrayList<>();

    // INCOMPLETE.
    public boolean add(E element) {
        // Adds element to the list when it does not already exist.
        // Returns true on success and false otherwise.
        if (contains(element) == false){
            array.add(element);
            return true;
        }
        return false;
    }
    
    // INCOMPLETE.
    public String toString() {
            if (array.isEmpty()) {
                return "[]";
            }
            StringBuilder ret = new StringBuilder("[");
            for (int i=0;i<array.size();i++) {
                ret.append(array.get(i)).append(", ");
            }
            ret.deleteCharAt(ret.length()-1);
            ret.setCharAt(ret.length()-1, ']');
            return ret.toString();
    }
        
        // Returns a string representation of this Set object.
    
    public void clear() {
        array.clear();
    }

    public boolean contains(E element) {
        return array.contains(element);
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }

    public boolean remove(E element) {
        return array.remove(element);
    }

    public int size() {
        return array.size();
    }

    public static void main(String args[]) {
        
        try {
            
            //Create a WordReader object to read words from a file.
            WordReader in = new WordReader(args[0]);
            String str = null;

            // Keep reading words while next word is not-null.
            while ((str = in.readWord()) != null) {
                System.out.println(str);
            }

            in.close(); // Close the file.
            
        } catch (IOException ex) {
            System.out.println("Error :" + ex);
            System.exit(1);
        }
        
    }
    
}
