
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        
        Container container1 = new Container();
        Container container2 = new Container();
        // System.out.println(container);

        // container.add(50);
        // System.out.println(container);
        // System.out.println(container.contains());

        // container.remove(60);
        // System.out.println(container);

        // container.add(200);
        // System.out.println(container);

        Scanner scan = new Scanner(System.in);
        

        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }  

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                container1.add(amount);
            } else if (command.equals("move")){
                if (container1.contains() > 0) {
                    int movedAmount = Math.min(amount, container1.contains());
                    container1.move(movedAmount);
                    container2.add(movedAmount);
                }
            } else if (command.equals("remove")){
                container2.remove(amount);
            }
        }
    }

}
