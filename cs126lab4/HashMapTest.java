public class HashMapTest {
    public static void main (String[] args){
        HashMap<String, String> hashMap1 = new HashMap<>();

        hashMap1.add("118", "Programming");
        hashMap1.add("126", "design");
        hashMap1.add("130", "maths1");
        hashMap1.add("131", "maths2");
        hashMap1.add("132", "architecture");
        hashMap1.add("133", "skills");
        hashMap1.add("139", "webdev");
        hashMap1.add("140", "security");
        hashMap1.add("141", "funct");

        System.out.println(hashMap1.find("126"));
    }
}
