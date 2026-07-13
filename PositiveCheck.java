import java.util.Scanner;

class PositiveCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive Integer");
        }
        else {
            System.out.println("Not a Positive Integer");
        }
    }
}