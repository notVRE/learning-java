
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        String names = "";
        int ninfo = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String [] info = input.split(",");
            year = year + Integer.valueOf(info[1]);
            ninfo = ninfo + 1;
            for (String name : info) {
                if (name.length() > names.length()) {
                    names = name;
                }
            }
        }
        System.out.println("Longest name: " + names);
        System.out.println("Average of the birth years: " + (1.0 * year / ninfo));
    }
}
