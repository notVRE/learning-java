
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oage = -1;
        String nage = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String [] info = input.split(",");
            int age = Integer.valueOf(info[1]);
            if (age > oage) {
                oage = age;
                nage = info[0];
            }
        }
        System.out.println("Name of the oldest: " + nage);
    }
}
