
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString(){
        String output = "The collection " + this.name;

        if (elements.isEmpty()) {
            return output + " is empty.";
        }

        String listOfElements = "";

        for (String string : elements) {
            listOfElements = listOfElements + string + "\n";
        }

        if (elements.size() == 1) {
            return output + " has " + this.elements.size() + " element:" + "\n" +this.elements.get(0);
        }


         return output + " has " + this.elements.size() + " elements:" + "\n" + listOfElements;

    }
}
