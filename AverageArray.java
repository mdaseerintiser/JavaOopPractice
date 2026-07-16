import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        double[] arr = new double[n];

        double sum = 0;

        System.out.println("Enter the values:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        double average = sum / n;

        System.out.println("Average = " + average);

        sc.close();
    }
}