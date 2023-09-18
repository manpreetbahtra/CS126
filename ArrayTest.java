/**
 * An array of Strings program
 */
public class ArrayTest {

    public static void main(String args[]) {
        String words[] = new String[4];

        words[0] = "I";
        words[1] = "am";
        words[2] = "the";
        words[3] = "eggman";

        //System.out.println(words); it also prints out the reference in memory
        for (int i =0; i<words.length; i++){
            System.out.println(words[i]);
        }
    }
}
