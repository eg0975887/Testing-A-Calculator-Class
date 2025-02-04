public class Calculator {
    int add(int a, int b){
        return a + b;
    }

    int subtract(int a, int b){
        return a - b;
    }

    int multiply(int a, int b){
        return a * b;
    }

    double divide(int a, int b){
        double div = 0.0;
        try {
            div = a / b;
        } catch (ArithmeticException e) {
            System.out.println("You cant divide by zero. Please try again.");
        }
        return div;
    }


}
