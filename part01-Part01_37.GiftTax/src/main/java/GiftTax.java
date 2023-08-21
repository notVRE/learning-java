
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int tax = Integer.valueOf(scan.nextLine());
 
        if (tax >= 5000 && tax <= 25000) {
            double tr =  (100 + (tax - 5000)*0.08);
            System.out.println("Tax: " + tr);
        } else if (tax >= 25000 && tax <= 55000){
            double tr =  (1700 + (tax - 25000)*0.10);
            System.out.println("Tax: " + tr);
        } else if (tax >= 55000 && tax <= 200000){
            double tr =  (4700 + (tax - 55000)*0.12);
            System.out.println("Tax: " + tr);
        } else if (tax >= 200000 && tax <= 1000000){
            double tr =  (22100 + (tax - 200000)*0.15);
            System.out.println("Tax: " + tr);
        } else if (tax > 1000000) {
            double tr =  (142100 + (tax - 1000000)*0.17);
            System.out.println("Tax: " + tr);   
        }else{
            System.out.println("No tax!");
        }
    }
}
