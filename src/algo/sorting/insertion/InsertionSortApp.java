package algo.sorting.insertion;

/**
 * Created by Jainik on 1/11/2015.
 */
public class InsertionSortApp {
    public static void main(String[] args) {
        InsertionSort arr = new InsertionSort(100);

        arr.insert(12);
        arr.insert(3254);
        arr.insert(1);
        arr.insert(2);
        arr.insert(234);
        arr.insert(53);
        arr.insert(123);
        arr.insert(66);
        arr.insert(23);
        arr.insert(43);
        arr.insert(121);

        arr.display();

        arr.insertionSort();

        arr.display();


    }
}
