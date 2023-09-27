import java.util.Scanner;

public class UserInterface {

    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManger,Scanner scanner){
        this.jokeManager = jokeManger;
        this.scanner = scanner;
    }

    public void start(){
        while (true){
            System.out.println("Commands" + "\n" + "1 - add a joke" + "\n" + "2 - draw a joke" + "\n" + "3 - list jokes" + "\n" + "X - stop");
            String opt = scanner.nextLine();

            if (opt.equals("1")) {
                System.out.println("Write the jokes to be added:");
                String aJoke = scanner.nextLine();
                this.jokeManager.addJoke(aJoke);
            } else if (opt.equals("2")){
                System.out.println(this.jokeManager.drawJoke());
            } else if (opt.equals("3")){
                System.out.println("Printing the jokes.");
                this.jokeManager.printJokes();
            } else if (opt.equalsIgnoreCase("x")){
                break;
            }

        }
    }
}
