import java.util.Scanner;

public class ui {
    private PointAverage average;
    private Scanner scanner;

    public ui(PointAverage average, Scanner scanner){
        this.average = average;
        this.scanner = scanner;
    }

    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        readAvg();
        System.out.println("Point average (all): " + average.averageOfPoints());
        System.out.println();
    }

    public void readAvg(){
        while (true) {
            int point = Integer.valueOf(scanner.nextLine());
            if (point == - 1) {
                break;
            }

            if (point > 0) {
                this.average.addPoint(point);
            }

        }
    }

}
