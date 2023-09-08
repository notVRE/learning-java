
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nos = new ArrayList<>();
       
        while (true) {
            String numberOfString = scanner.nextLine();

            if (numberOfString.equals("end")) {
                break;
            }
            
            nos.add(numberOfString);
        }
        System.out.println(nos.size());
    }
}
