
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nmb = 0;
        while (true) {
            System.out.println("Give a number:");
            int n = Integer.valueOf(scanner.nextLine());
            if (n != 0) {
                nmb += n;
                continue;
            } else {
                break;
            }
        }
        System.out.println("Sum of the numbers: " + nmb);
    }
}
