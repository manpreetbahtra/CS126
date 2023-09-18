/**
  Program to test out singly linked-list ADT
*/
public class ListTest
{
    public static void main(String[] args)
    {
        // do some work here...
      MyLinkedList<String> List1 = new MyLinkedList<>();
      MyLinkedList<String> List2 = new MyLinkedList<>();
      MyLinkedList<String> List3 = new MyLinkedList<>();

      System.out.println(List1);
      List1.add("Manpreet");
      System.out.println(List1);
      List2.add("CS126");
      List2.add("Lab2");
      System.out.println(List2.toString());
      List2.addToTail("anything");
      System.out.println(List2);

      List3.add("1 element");
      List3.add("2 element");
      List3.addToTail("tail element");
      System.out.println(List3);
      List3.removeFromHead();
      List3.removeFromTail();
      System.out.println(List3);


    }
}
