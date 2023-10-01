public class Project {
    public static void main(String[] args) {
        int[] array = ArrayUtils.prepareArray(20);
        ArrayUtils.printArray(array);
        PyramidSort.sort(array);
        ArrayUtils.printArray(array);

    }

}
