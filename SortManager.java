import java.util.Random;

public class SortManager {
    public static void main(String[] args) {
        //generar 500 numeros aleatorios entre 1 y 10000
        Integer[] array = generateRandomArray(500,1,10000);
        
    }
    //metodo para generar el array de numeros aleatorios
    public static Integer[] generateRandomArray(int size, int min, int max){
        Random random = new Random();
        Integer[] array = new Integer[size];

        for (int i = 0; i < size; i++){
            array[i] = random.nextInt(max - min + 1)+ min;
        }
        return array;
    }
}
