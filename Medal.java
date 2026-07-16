import java.util.Scanner;

public class Medal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();

        System.out.print("Semester Completed? (true/false): ");
        boolean completed = sc.nextBoolean();

        if (gpa >= 3.5) {

            if (completed) {
                System.out.println("Student gets a Medal.");
            } else {
                System.out.println("Semester not completed.");
            }

        } else {
            System.out.println("No Medal.");
        }

        sc.close();
    }
}