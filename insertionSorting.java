package datastructure.com;
/**
* ajay biradar


*/
import java.util.Arrays;

public class insertionSorting {

    public void insertionSort(String[] array) {

        for (int i = 0; i < (array.length-1); i++) {
            String str = array[i+1];

            while (i>=0 && ((str.compareTo(array[i])) < 0)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = str;
        }
    }

    public static void main(String[] args) {
        String[] data = { "Ajay","Onkar","Abhi","Arpita","Arati" };
        insertionSorting insert = new insertionSorting();
        insert.insertionSort(data);
        System.out.println("Sorted Array : ");
        System.out.println(Arrays.toString(data));

    }
}

