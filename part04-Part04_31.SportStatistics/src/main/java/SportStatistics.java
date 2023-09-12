
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> csgo = new ArrayList<>();

        System.out.println("File");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        int count = 0;
        int w = 0;
        int l = 0;

        try (Scanner scanner = new Scanner(Paths.get(file))){
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                csgo.add(line);

                String[] parts = line.split(",");
                String teamName = parts[0];
                String teamName1 = parts[1];
                int teamScore = Integer.valueOf(parts[2]);
                int teamScore1 = Integer.valueOf(parts[3]);

                if (team.equals(teamName)) {
                    count++;
                }

                if (team.equals(teamName1)) {
                    count++;
                }

                if (team.equals(teamName) && (teamScore > teamScore1)) {
                    w++;
                }

                if (team.equals(teamName1) && (teamScore1 > teamScore)) {
                    w++;
                }
            }

            System.out.println("Games: " + count);
            System.out.println("Wins: " + w);
            System.out.println("Losses: " + (count-w));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
