package github.bthomask.algorithms.sort;

import junit.framework.TestCase;

public class BubbleSortTest extends TestCase {

    public void testBubbleSort() {

        int [] testData = {1,-15,-6,22,11,0};

        BubbleSort.sort(testData);

        for (int item : testData) {
            System.out.println(item);
        }

    }
}