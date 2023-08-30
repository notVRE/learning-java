
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        int n = 0;
        while (n < array.length) {
            int number = array[n];
            if (n == 0) {
                System.out.print(number);
            } else {
                System.out.print( "," + number);
            }
            n = n + 1;
        }
    }
}
