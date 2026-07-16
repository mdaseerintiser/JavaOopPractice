public class SEDW {
    public static void main(String[] args) {

        int i = 2;
        int sum = 0;

        do {
            sum += i;
            i += 2;
        } while (i <= 20);

        System.out.println("Sum = " + sum);
    }
}