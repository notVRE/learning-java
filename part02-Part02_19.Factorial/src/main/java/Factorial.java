
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fcr = 1;
        System.out.print("Give a number: ");
        int n = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            fcr *= i;
        }
        System.out.println("Factorial: " + fcr);
    }
}
