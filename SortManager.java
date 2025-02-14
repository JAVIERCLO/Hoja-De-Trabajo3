import java.util.Random;

public class SortManager {
    public static void main(String[] args) {
        // generar 500 numeros aleatorios entre 1 y 10000
        Integer[] array = generateRandomArray(500, 1, 10000);

        // crear instanias de los algoritmos de sort
        ISort<Integer> quickSort = new QuickSort<>();
        ISort<Integer> mergeSort = new MergeSort<>();
        ISort<Integer> shellSort = new ShellSort<>();
        ISort<Integer> insertionSort = new InsertionSort<>();
        ISort<Integer> radixSort = new RadixSort<>();

        Profiler profiler = new Profiler();

        runAndMeasureTime(quickSort, array.clone(), "QuickSort", profiler);
        runAndMeasureTime(mergeSort, array.clone(), "MergeSort", profiler);
        runAndMeasureTime(shellSort, array.clone(), "ShellSort", profiler);
        runAndMeasureTime(insertionSort, array.clone(), "InsertionSort", profiler);
        runAndMeasureTime(radixSort, array.clone(), "RadixSort", profiler);
    }

    // metodo para generar el array de numeros aleatorios
    public static Integer[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        Integer[] array = new Integer[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    private static <T extends Comparable<T>> void runAndMeasureTime(ISort<T> algo, T[] array, String name,
            Profiler profiler) {
        double time = profiler.measureTime(algo, array);
        System.out.println(name + "tarda " + time + " ms");
    }
}