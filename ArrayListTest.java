/**
 * A vector of Strings program
 */
import java.util.ArrayList;


public class ArrayListTest {

    public static void main(String args[]) {
        // Initialization of ArrayList, holding String objects
        MyArrayList<String> words = new MyArrayList<>(); 

        words.add("I");
        words.add("am");
        words.add("the");
        words.add("eggman");


        // words.add("We are the eggmen");
        // words.remove("am");
        System.out.println(words.contains("eggman"));
        System.out.println(words.contains("tea"));
        

        System.out.println(words);
    }
}
