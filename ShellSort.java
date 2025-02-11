//Custom sort Elegido
public class ShellSort<T extends Comparable<T>> implements ISort<T> {
    @Override
    public void sort(T[] array){

        int n = array.length;

        //Gaps estilo Knuth
        int gap = 1;
        while (gap < n / 3) {
            gap = 3 * gap + 1;
        }

        //Sort utilizando los gaps
        while (gap >= 1) {
            for (int i = gap; i < n; i++) {
                T key = array[i];
                int j = i;

                while (j >= gap && array[j - gap].compareTo(key) > 0) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = key;
            }

            gap /= 3;
        }
    }
}
