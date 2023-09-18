public class TestStack {
    public static void main(String[] args){
        MyStack<String> Stack1 =new MyStack<>();

        Stack1.push("1");
        Stack1.push(" 2");
        Stack1.push(" 3");
        System.out.println(Stack1.pop());
        System.out.println(Stack1.pop());
        System.out.println(Stack1.isEmpty());

    }
}
