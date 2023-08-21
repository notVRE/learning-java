
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int non = 0;
        while (true) {
            System.out.println("Give a number:");
            int n = Integer.valueOf(scanner.nextLine());
            if (n != 0) {
                non += 1;
                continue;
            } else {
                break;
            }
        }
        System.out.println("Number of numbers: " + non);
    }
}
