
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String wd = scan.next();
        System.out.println("Give an integer:");
        int n1 = Integer.valueOf(scan.next());
        System.out.println("Give a double:");
        double n2 = Double.valueOf(scan.next());
        System.out.println("Give a boolean:");
        boolean tf = Boolean.valueOf(scan.next());
 
        System.out.println("You gave the string " + wd);
        System.out.println("You gave the integer " + n1);
        System.out.println("You gave the double " + n2);
        System.out.println("You gave the boolean " + tf);
    }
}
