package github.bthomask.algorithms.sort;

import junit.framework.TestCase;

public class ShellSortTest extends TestCase {

    public void testShellSort() {

        int [] testData = {1,-15,-6,22,11,0};

        ShellSort.sort(testData);

        for (int item : testData) {
            System.out.println(item);
        }

    }
}