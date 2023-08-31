
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        int str = 0;
        while (str < array.length) {
            int nstr = array[str];
            str += 1;
            for (int i = 0; i < nstr; i++) {
                System.out.print("*");
            }
                System.out.println("");
        }
    }
}
