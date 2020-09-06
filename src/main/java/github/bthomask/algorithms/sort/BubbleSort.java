package github.bthomask.algorithms.sort;

public class BubbleSort {

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

        for (int i=length - 1; i > 0; i--){
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    swap(array,j,j+1);
                }
            }
        }

    }

}
