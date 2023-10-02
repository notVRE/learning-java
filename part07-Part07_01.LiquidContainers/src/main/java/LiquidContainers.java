
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int addAmount = 0;
        int moveAmount = 0;

        while (true) {
            System.out.println("First: " + addAmount + " /100");
            System.out.println("Second: " + moveAmount + " /100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (amount > 0) {
                    addAmount = Math.min(addAmount + amount,100);
                }
            }

            if (command.equals("move")) {
                if (amount > addAmount) {
                    moveAmount += addAmount;
                    addAmount = 0;
                } else {
                    addAmount -= amount;
                    moveAmount += amount;
                }

                if (addAmount < 0) {
                    addAmount = 0;
                }

                if (moveAmount > 100) {
                    moveAmount = 100;
                }
            }

            if (command.equals("remove")) {
                if (moveAmount > 0) {
                    moveAmount -= amount;
                }

                if (moveAmount < 0) {
                    moveAmount = 0;
                }
            }
        }
    }

}
