
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Give a number:");
        int nmb = Integer.valueOf(scan.nextLine());
        if (nmb % 2 == 0) {
            System.out.println("Number " + nmb + " is even");
        }else{
            System.out.println("Number " + nmb + " is odd");
        }
    }
}
