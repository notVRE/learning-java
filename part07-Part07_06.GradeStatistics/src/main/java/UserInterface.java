import java.util.Scanner;

public class UserInterface {
    private Points points;
    private Scanner scanner;

    public UserInterface(Points points, Scanner scanner){
        this.points = points;
        this.scanner = scanner;
    }

    public void start(){
        System.out.println("Enter point totals,-1 stops:");
        readPoints();
        System.out.println("Point average (all): " + points.pointAverage());
        if (points.passingPoint() >= 50) {
            System.out.println("Point average (passing): " + points.passingPoint());
        } else {
            System.out.println("Point passing (passing): -" );
        }
        System.out.println("Point percentage: " + points.passPercentage());
        System.out.println("Grade distribution:");
        printPointDistribution();
    }

    public void readPoints(){
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            this.points.addPoints(input);
        }
    }

    public void printPointDistribution(){
     int [] gradeCounts = new int[6];
        for (int point : points.getAllPoints()) {
            int grade = points.pointsToStars(point);
            gradeCounts[grade]++;
        }

        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            printsStars(gradeCounts[i]);
            System.out.println();
        }
    }


    public static void printsStars(int stars){
        while (stars > 0){
            System.out.print("*");
            stars--;
        }
    }
}
