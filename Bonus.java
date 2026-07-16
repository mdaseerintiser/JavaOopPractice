import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sales Percentage: ");
        int sales = sc.nextInt();

        System.out.print("Enter Attendance Percentage: ");
        int attendance = sc.nextInt();

        if (sales >= 95) {

            if (attendance == 100) {
                System.out.println("Bonus = 60%");
            } else if (attendance >= 90) {
                System.out.println("Bonus = 40%");
            } else {
                System.out.println("Bonus = 5%");
            }

        } else if (sales >= 80) {

            if (attendance == 100) {
                System.out.println("Bonus = 40%");
            } else if (attendance >= 90) {
                System.out.println("Bonus = 20%");
            } else {
                System.out.println("Bonus = 5%");
            }

        } else {
            System.out.println("Bonus = 5%");
        }

        sc.close();
    }
}