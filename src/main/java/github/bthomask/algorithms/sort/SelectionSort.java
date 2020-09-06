package github.bthomask.algorithms.sort;

public class SelectionSort {

    public static void swap(int[] array, int x, int y) {
        if( array[x] == array[y]) {
            return;
        }
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static void sort(int[] array) {

        int length  = array.length;
        // lui last unsorted index.
        for (int lui=length - 1; lui > 0; lui--){
            int larget = 0;
            for (int j = 0; j <= lui; j++) {
                if (array[j] > array[larget]) {
                larget = j;
                }
                swap(array, larget, lui);
            }
        }

    }

}
