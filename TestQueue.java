public class TestQueue{
    public static void main(String[] args){
        MyQueue<String> Queue1 =new MyQueue<>();

        Queue1.modifyHead("aa");
        Queue1.enqueue("head");
        System.out.println(Queue1.toString());
        Queue1.enqueue(" middle");
        System.out.println(Queue1.toString());
        Queue1.enqueue(" tail");
        System.out.println(Queue1.toString());
        Queue1.dequeue();
        System.out.println(Queue1.toString());
        Queue1.modifyHead("gvhbx");
        System.out.println(Queue1);

    }
}