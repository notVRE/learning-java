
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nn = 0;
        int sum = 0;
        double avg = 0;
        while (true) {
            int n = Integer.valueOf(scanner.nextLine());
            if (n == 0) {
                break;  
            } else if (n > 0){
                nn += 1;
                sum += n;
                avg = (double) sum / nn;
                continue;       
            }
        }
        if (avg == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(avg);
        } 
    }
}
