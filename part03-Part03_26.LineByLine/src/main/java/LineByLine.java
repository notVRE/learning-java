
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            String spt = scanner.nextLine();
            String [] piece = spt.split(" ");
            for (String string : piece) {
            System.out.println(string);
            }
            if (spt.equals("")) {
                break;
            }
        }


    }
}
