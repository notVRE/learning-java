
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String av = scanner.nextLine();
            String [] spc = av.split(" ");
            for (String string : spc) {
                if (string.contains("av")) {
                    System.out.println(string);
                } 
            }
            if (av.isEmpty()) {
                break;
            }
        }
    }
}
