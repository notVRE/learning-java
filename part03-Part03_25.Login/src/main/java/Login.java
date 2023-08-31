
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String uname1 = "alex";
        String uname2 = "emma";
        String pw = "sunshine";
        String pw1 = "haskell";
        System.out.print("Enter username: ");
        String un = String.valueOf(scanner.nextLine());
        System.out.print("Enter password: ");
        String pws = String.valueOf(scanner.nextLine());
        if (un.equals(uname1) && pws.equals(pw)) {
            System.out.println("You have successfully logged in!");
        } else if (un.equals(uname2) && pws.equals(pw1)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
        
    }
}
