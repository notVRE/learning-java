
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int grd = Integer.valueOf(scan.nextLine());
        if (grd < 0) {
            System.out.println("impossible!");
        } else if (grd <= 49){
            System.out.println("failed");
        } else if (grd <= 59){
            System.out.println("1");
        } else if (grd <= 69){
            System.out.println("2");
        } else if (grd <= 79){
            System.out.println("3");
        } else if (grd <= 89){
            System.out.println("4");
        } else if (grd <= 100){
            System.out.println("5");
        } else{
            System.out.println("incredible!");
        }
    }
}
