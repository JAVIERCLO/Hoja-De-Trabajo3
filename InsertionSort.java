public class InsertionSort<T extends Comparable<T>> implements ISort<T> {

    @Override
    public void sort(T[] array) {
        if (array == null || array.length == 0) {
            return;
        }
    
        int n = array.length;
        for (int i = 1; i < n; ++i ){
            T key = array.[1];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
        }
        array[j + 1] = key;
      }
    }
}