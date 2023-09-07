import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Name: ");
            String i1 = scanner.nextLine();
            if (i1.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            int i2 = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(i1, i2));
        }
        System.out.print("Program's maximum duration?: ");
        int i3 = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram televisionProgram : programs) {
            if (i3 >= televisionProgram.getDuration()) {
                System.out.println(televisionProgram);
            }
        }
    }
}
