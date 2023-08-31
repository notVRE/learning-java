
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            String [] last = input.split(" ");
            if (input.equals("")) {
                break;
            }
            System.out.println(last[last.length - 1]);
        }

    }
}
