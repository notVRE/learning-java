import java.util.ArrayList;

public class Room {
    
    private ArrayList<Person> persons;

    public Room(){
        this.persons = new ArrayList<>();
    }

    public void add(Person person){
        persons.add(person);
    }

    public boolean isEmpty(){
        if (persons.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons(){
        return persons;
    }

    public Person shortest(){
        if (persons.isEmpty()) {
            return null;
        }

        Person returnHeight = this.persons.get(0);

        for (Person person : persons) {
            if (person.getHeight() < returnHeight.getHeight()) {
                returnHeight = person;
            }
        }
        return returnHeight;
    }

    public Person take(){
        if (persons.isEmpty()) {
            return null;
        }
        
        Person returnHeight = this.persons.get(0);
        int shortest = 0;

        for (int i = 1; i < persons.size(); i++) {
            Person person = persons.get(i);
            if (person.getHeight() < returnHeight.getHeight()) {
                returnHeight = person;
                shortest = i;
            }
        }
        persons.remove(shortest);

        return returnHeight;

    }



}
