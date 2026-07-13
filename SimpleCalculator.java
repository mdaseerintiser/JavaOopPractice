import java.util.*;

class SimpleCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = scan.nextInt();

        System.out.print("Enter second integer: ");
        int b = scan.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char ch = scan.next().charAt(0);

        if (ch == '+') {
            System.out.println("Result = " + (a + b));
        }
        else if (ch == '-') {
            System.out.println("Result = " + (a - b));
        }
        else if (ch == '*') {
            System.out.println("Result = " + (a * b));
        }
        else if (ch == '/') {
            System.out.println("Result = " + (a / b));
        }
        else {
            System.out.println("Invalid Operator");
        }
    }
}