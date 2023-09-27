import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> manager;

    public JokeManager(){
        this.manager = new ArrayList<>();
    }

    public void addJoke(String joke){
        manager.add(joke);
    }

    public String drawJoke(){
        if (manager.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(manager.size());
            return manager.get(index);
        }
    }

    public void printJokes(){
        for (String string : manager) {
            System.out.println(string);
        }
    }


}
