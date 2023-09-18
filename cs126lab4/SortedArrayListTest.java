public class SortedArrayListTest {
    public static void main(String[] args){
        SortedArrayList<String> sortedArrayList1 =new SortedArrayList<>();

        sortedArrayList1.add("cs");
        sortedArrayList1.add("126");
        sortedArrayList1.add("lab");
        sortedArrayList1.add("4");

        System.out.print("finding linear ");
        System.out.println(sortedArrayList1.findLinear("4"));
//explanation for why the answer is 2 instead of 4-- before the add method was implemented,
//answer was 4, but since add method sorts them, it takes fewer searches.
//but linear search in general doesnt require items to be sorted. 
        sortedArrayList1.add("anything");
        System.out.println(sortedArrayList1);


        //milestone 2
        sortedArrayList1.add("bat");
        sortedArrayList1.add("fuyqf");
        sortedArrayList1.add("door");
        sortedArrayList1.add("vhjk");
        sortedArrayList1.add("gu");
        sortedArrayList1.add("kioj");
        sortedArrayList1.add("oih");
        sortedArrayList1.add("fguef");
        sortedArrayList1.add("wefw");
        sortedArrayList1.add("gergrt");
        sortedArrayList1.add("dgrg");
        sortedArrayList1.add("rg");
        sortedArrayList1.add("ergbf");
        System.out.println(sortedArrayList1);
        System.out.println(sortedArrayList1.findBinary("wefw"));
        System.out.println(sortedArrayList1.findBinary("oih"));
        System.out.println(sortedArrayList1.findBinary("bjk"));
    }
}