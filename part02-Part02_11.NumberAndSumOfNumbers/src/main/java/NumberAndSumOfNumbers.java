
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nn = 0;
        int sn = 0;
        while (true) {
            System.out.println("Give a number:");
            int n = Integer.valueOf(scanner.nextLine());
            if (n != 0) {
                nn += 1;
                sn += n;
                continue;
            } else {
                break;
            }
        }
        System.out.println("Number of numbers: " + nn);
        System.out.println("Sum of the numbers: " + sn);
    }
}
