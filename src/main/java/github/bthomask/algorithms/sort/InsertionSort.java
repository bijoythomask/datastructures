package github.bthomask.algorithms.sort;

public class InsertionSort {


    public static void sort(int[] array) {

        // fui first unsorted index.
        for (int fui = 1; fui < array.length; fui++){
            int currentSelection = array[fui];
            int index = 0;
            for (index = fui; (index > 0 && array[index-1] > currentSelection) ; index--) {
                array[index] = array[index-1];
            }
            array[index] =currentSelection;
        }

    }

}
