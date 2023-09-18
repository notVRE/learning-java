
public class MainProgram {

    public static void main(String[] args) {

        Pet lucy = new Pet("lucy", "Golden retriever");
        Person leo = new Person("Leo", lucy);

        System.out.println(leo);
    }
}
