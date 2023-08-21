
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s1 = Integer.valueOf(scanner.nextLine());
        int s2 = Integer.valueOf(scanner.nextLine());
        int s3 = s1 + s2;
        double ss = Math.sqrt(s3);
        System.out.println(ss);
    }
}
