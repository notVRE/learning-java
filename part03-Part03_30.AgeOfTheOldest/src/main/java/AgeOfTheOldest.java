
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oage = -1;
        while (true) {
            String info = scanner.nextLine();
            if (info.equals("")) {
                break;
            }
            String [] name = info.split(",");
           int age = Integer.valueOf(name[1]);
           if (age > oage) {
                oage = age;
           }
        }
        System.out.println("Age of the oldest: " + oage);
    }
}
