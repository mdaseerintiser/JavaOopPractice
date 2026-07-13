import java.util.Scanner;

class CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();

        double f = (9.0 / 5.0) * c + 32;

        System.out.println("Fahrenheit = " + f);
    }
}