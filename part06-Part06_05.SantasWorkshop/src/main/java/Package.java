import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> weight;

    public Package(){
        this.weight = new ArrayList<>();
    }

    public void addGift(Gift gift){
        this.weight.add(gift);
    }

    public int totalWeight(){
        int giftWeight = 0;
        for (Gift wGifgt : weight) {
            giftWeight += wGifgt.getWeight();
        }
        return giftWeight;
    }


}
