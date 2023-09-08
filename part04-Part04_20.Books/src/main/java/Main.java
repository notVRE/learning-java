import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> info = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                System.out.println();
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int i3 = Integer.valueOf(scanner.nextLine());

            info.add(new Book(title, pages, i3));
        }

        System.out.print("What information will be printed? ");
        String choice = scanner.nextLine();

        for (Book book : info) {
            if (choice.toLowerCase().equals("everything")) {
                System.out.println(book);
            } else if (choice.toLowerCase().equals("name")) {
                System.out.println(book.getTitle());
            }
        }

    }
}
