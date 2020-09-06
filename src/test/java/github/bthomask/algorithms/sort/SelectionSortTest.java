package github.bthomask.algorithms.sort;

import junit.framework.TestCase;

public class SelectionSortTest extends TestCase {

    public void testSelectionSort() {

        int [] testData = {1,-15,-6,22,11,0};

        SelectionSort.sort(testData);

        for (int item : testData) {
            System.out.println(item);
        }

    }
}