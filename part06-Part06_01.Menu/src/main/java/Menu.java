
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal){
        if (!(this.meals.contains(meal))) {
             this.meals.add(meal);
        }
    }

    public void printMeals(){
        for (String string : this.meals) {
            System.out.println(string);
        }
    }

    public void clearMenu(){
        this.meals.clear();
    }
}
