public class DivisionOperations{
    public static void main(String[] args) {
        int a = 15;
        int b = 0;
        try {
            int Div = a/b;
            System.out.println("Division"+Div);
        } catch (ArithmeticException e) {
            System.out.println("Error:cannot divide by zero.");
        }
    }
}
