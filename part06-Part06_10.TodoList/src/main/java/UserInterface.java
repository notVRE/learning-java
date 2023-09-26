import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList todoList,Scanner scanner){
        this.list = todoList;
        this.scanner = scanner;
    }

    public void start(){
        while (true) {
            System.out.print("Command: ");
            String opt = scanner.nextLine();

            if (opt.equals("stop")) {
                break;
            } 

            if (opt.equals("add")){
                System.out.print("To add: ");
                String oa = scanner.nextLine();
                list.add(oa); 
            } 
            
            if (opt.equals("list")) {
                list.print();
            } 
            
            if (opt.equals("remove")){
                System.out.print("Which one is removed? ");
                int rem = Integer.valueOf(scanner.nextLine());
                list.remove(rem);
            }
        }
    }
}