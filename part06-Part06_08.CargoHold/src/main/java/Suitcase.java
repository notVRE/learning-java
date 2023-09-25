import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int weight;

    public Suitcase(int weight){
        this.items = new ArrayList<>();
        this.weight = weight;
    }

    public void addItem(Item item){
        int totalWeight = 0;

        for (Item maxItem : items) {
            totalWeight += maxItem.getWeight();
        }

        if (totalWeight + item.getWeight() <= weight) {
            items.add(item);
        }
    }

    public void printItems(){
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight(){
        int allWeight = 0;

        for (Item item : items) {
            allWeight += item.getWeight();
        }

        return allWeight;
    }

    public Item heaviestItem(){
        if (items.isEmpty()) {
            return null;
        }

        Item returnWeight = this.items.get(0);

        for (Item item : items) {
            if (item.getWeight() > returnWeight.getWeight()) {
                returnWeight = item;
            }
        }
        return returnWeight;
    }

    public String toString(){
        int totalWeight = 0;

        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        
        if (this.items.size() == 0) {
            return "no items" + " (" + totalWeight + "kg)";
        } else if(this.items.size() == 1){
            return this.items.size() + " item (" + totalWeight + " kg)";
        }

        return this.items.size() + " items (" + totalWeight + " kg)" ;
    }
}
