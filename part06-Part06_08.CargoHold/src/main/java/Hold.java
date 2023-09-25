import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> hold;
    private int maxWeight;

    public Hold(int maxWeight){
        this.hold = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase){
        int maxTotalWeight = 0;

        for (Suitcase suitcase2 : hold) {
            maxTotalWeight += suitcase2.totalWeight();
        }

        if (maxTotalWeight + suitcase.totalWeight() <= maxWeight) {
            hold.add(suitcase);
        }
    }

    public void printItems(){
        for (Suitcase suitcase : hold) {
            suitcase.printItems();
        }
    }

    public String toString(){
        int maxTotalWeight = 0;

        for (Suitcase suitcase : hold) {
            maxTotalWeight += suitcase.totalWeight();
        }

        return this.hold.size() + " suitcases (" + maxTotalWeight + "kg)";
    }
}
