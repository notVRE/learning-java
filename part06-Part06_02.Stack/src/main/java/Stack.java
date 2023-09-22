import java.util.ArrayList;

public class Stack {
    private ArrayList<String> value;

    public Stack(){
        this.value = new ArrayList<>();
    }

    public boolean isEmpty(){
        if (this.value.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String value){
        this.value.add(value);
    }

    public ArrayList<String> values(){
        return this.value;
    }

    public String take(){
        int index = this.value.size() - 1;

        return this.value.remove(index);
    }
    
}
