import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 2, 5, 99, 3, 12};
        int[] numbers = {3, 2, 5, 4, 8};

        System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));

        int[] numbers1 = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers1));
        MainProgram.sort(numbers1);

    }

    public static int smallest(int[] array){
        int smallest = array[0];

        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex){
        
        int sIndex = startIndex;
        int index = table[startIndex];

        for (int i = 1 + startIndex; i < table.length; i++) {
            if (table[i] < index) {
                index = table[i];
                sIndex = i;
            }
        }
        return sIndex;
    }

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
            System.out.println(Arrays.toString(array));
        }
    }
}
