
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.print("First Number? ");
        int n1 = Integer.valueOf(scanner.nextLine());
        System.out.print("Last Number? ");
        int n2 = Integer.valueOf(scanner.nextLine());
        for (int i = n1; i <= n2; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}
