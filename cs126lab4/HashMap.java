// This line allows us to cast our object to type (E) without any warnings.
// For further detais, please see: http://docs.oracle.com/javase/1.5.0/docs/api/java/lang/SuppressWarnings.html
@SuppressWarnings("unchecked") 
public class HashMap<K extends Comparable<K>,V> implements IMap<K,V> {

    protected KeyValuePairLinkedList[] table;
    
    public HashMap() {
        /* for very simple hashing, primes reduce collisions */
        this(11);
    }
    
    public HashMap(int size) {
        table = new KeyValuePairLinkedList[size];
        initTable();
    }

    // INCOMPLETE.
    //average comparisons 1 since i am making use of get method which directly retrieves it. 
    
    public int find(K key) {
        //returns the number of comparisons required to find element using Linear Search.
        int comparisons=0;
        get(key);
        comparisons ++;
        return comparisons;
    }

    public int find2 (K key){
        int index = hash(key);
        int comparisons =0;

        while (table[index] != null){
            if (table[index].equals(key)){
                comparisons++;
                return comparisons;
            }
            index = (index+1)% table.length;
            comparisons++;
        }
        return comparisons;
         
    }
    
    protected void initTable() {
        for(int i = 0; i < table.length; i++) {
            table[i] = new KeyValuePairLinkedList<>();
        }
    }
    
    protected int hash(K key) {
        int code = key.hashCode();
        return code;    
    }
    

    public void add(K key, V value) {
        int hash_code = hash(key);
        int location = hash_code % table.length;
        
        System.out.println("Adding " + value + " under key " + key + " at location " + location);
        
        table[location].add(key,value);
    }

    public V get(K key) {
        int hash_code = hash(key);
        int location = hash_code % table.length;
        
        ListElement<KeyValuePair> ptr = table[location].head;
        
        return (V)table[location].get(key).getValue();
    }
}
