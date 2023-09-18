public class Calculator {

    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();

        char c;
        while ((c = (char) System.in.read()) != 0) {
            calc.getToken(c);
        }
    }
    private MyStack<Integer> StackCalc = new MyStack<>(); //added
// MyStack<Integer> stack;
    public Calculator() {
    // stack = new MyStack<>();
    }

    public void getToken(char c) {
        if ('0' <= c && c <= '9') {
            newValueToken((int) (c - '0'));
        } else {
            switch (c) {
                case '+':
                    newPlus();
                    break;
                case '-':
                    newMinus();
                    break;
                case '*':
                    newMultiply();
                    break;
                case '/':
                    newDivide();
                    break;
                case '=':
                    evaluate();
                    break;
                case '\n':
                case '\t':
                case '\r':
                case ' ':
                    break;
                default:
                    System.out.println("Error bad input!!!Allowed inputs are: 0-9,+,-,*,/ and =");
            }
        }

    }

    protected void newValueToken(int d) {
        System.out.println("Digit " + d);
        StackCalc.push(d);
    // todo
    }

    protected void newPlus() {
    // todo
        int operand1= StackCalc.pop();
        int operand2= StackCalc.pop();
        int result= operand1 + operand2; 
        //System.out.println("Op +" + result);
        StackCalc.push(result);
        
    }

    protected void newMinus() {
        int operand1= StackCalc.pop();
        int operand2= StackCalc.pop();
        int result= operand1 - operand2; 
        //System.out.println("Op -" + result);
        StackCalc.push(result);
        // todo
    }

    protected void newDivide() {
        int operand1= StackCalc.pop();
        int operand2= StackCalc.pop();
        int result= operand1 / operand2; 
        //System.out.println("Op /" + result);
        StackCalc.push(result);
        // todo
    }

    protected void newMultiply() {
        int operand1= StackCalc.pop();
        int operand2= StackCalc.pop();
        int result= operand1 * operand2; 
        //System.out.println("Op *" + result);
        StackCalc.push(result);
        // todo
    }

// evaluate and reset the calculator
    protected void evaluate() {
        // todo
        
        System.out.println("Value = " + StackCalc.pop());
    }

}
