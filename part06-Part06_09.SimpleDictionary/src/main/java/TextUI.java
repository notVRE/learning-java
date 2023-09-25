import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary){
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start(){
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye Bye!");
                break;
            } else if (command.equals("add")){
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                this.simpleDictionary.add(word, translation);
            } else if (command.equals("search")){
                System.out.print("To be translated: ");
                String wTS = scanner.nextLine();
                String translation = this.simpleDictionary.translate(wTS);
                if (translation == null) {
                    System.out.println("Word " + wTS + " was not found");
                }else{
                    System.out.println("Translation: " + translation);
                }
                
            } else {
                System.out.println("Unknown command");
            }

        }
    }
}
