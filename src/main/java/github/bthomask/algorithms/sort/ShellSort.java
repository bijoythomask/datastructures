package github.bthomask.algorithms.sort;

public class ShellSort {


    public static void sort(int[] array) {

        for (int gap = array.length/2; gap > 0 ; gap/=2) {
            // fui first unsorted index.
            for (int fui = gap; fui < array.length; fui++){
                int currentSelection = array[fui];
                int index = fui;
                while (index >= gap && array[index-gap] > currentSelection) {
                    array[index] = array[index-gap];
                    index -= gap;
                }
                array[index] = currentSelection;
            }
        }

    }

}
