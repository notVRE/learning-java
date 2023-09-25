import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList(){
        this.list = new ArrayList<>();
    }

    public void add(String task){
        this.list.add(task);
    }

    public void print(){
        int taskNumber = 1;
        for (String string : list) {
            System.out.println(taskNumber + ": " + string);
            taskNumber++;
        }
    }

    public void remove(int number){
        if (number >= 1 && number <= list.size()) {
            list.remove(number - 1);
        }
    }
}
