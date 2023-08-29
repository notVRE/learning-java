
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Double> list = new ArrayList<>();
        while (true) {
            Double input = (double) scanner.nextInt();
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        double avg = 0;
        double sum = 0;
        for (Double double1 : list) {
            sum += double1;
            avg = sum / list.size();
        }
        System.out.println("Average: " + avg);
    }
}
