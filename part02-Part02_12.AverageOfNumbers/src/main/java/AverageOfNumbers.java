
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int nn = 0;
        double avg = 0;
        while (true) {
            System.out.println("Give a number:");
            int n = Integer.valueOf(scanner.nextLine());
            if (n != 0) {
                nn += 1;
                sum += n;
                avg = (double) sum / nn;
                continue;
            } else {
                break;
            }
        }
        System.out.println("Average of the numbers: " + avg);
    }
}
