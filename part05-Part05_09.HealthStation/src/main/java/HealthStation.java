public class HealthStation {

    private int countingWeighings;

    public int weigh(Person person) {  
        countingWeighings++;  
        return person.getWeight();
    }

    public void feed(Person person){
        int currentWeight = person.getWeight();

        person.setWeight(currentWeight + 1);
    }

    public int weighings(){
        return this.countingWeighings;
    }

}
