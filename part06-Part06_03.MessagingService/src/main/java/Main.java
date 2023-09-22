
public class Main {

    public static void main(String[] args) {

        MessagingService nms = new MessagingService();

        nms.add(new Message("World", "Hello"));
        System.out.println(nms.getMessages());
    }
}
