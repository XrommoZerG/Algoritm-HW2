import java.util.Random;

public class ArrayUtils {
    private static Random random = new Random();

    /**
     * Подготовка масива случайных чисел
     * @return
     */
    public static int[] prepareArray() {
        return prepareArray(random.nextInt(10,16));
    }

    /**
     * Подготовка масива случайных чисел
     * @param lenght размер масива
     * @return
     */
    public static int[] prepareArray(int lenght) {
        int[] array = new int[lenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-99,100);
        }
        return array;
    }

    /**
     * Печать масива на экпан
     * @param array
     * @return
     */
    public static void printArray(int[] array){
        for (int e : array){
            System.out.printf("%d\t", e);
        }
        System.out.println();
    }
}

