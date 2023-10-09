
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PointAverage average = new PointAverage();

        ui ui = new ui(average, scanner);
        ui.start();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
    }
}
