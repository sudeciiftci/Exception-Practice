public class Exercise {
    public static void main(String[] args) {

        int numerator = 50;
        int denominator = 0;

        try {
            int result = numerator / denominator;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program completed");
    }
}