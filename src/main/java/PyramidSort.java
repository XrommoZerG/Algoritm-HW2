public class PyramidSort {

    public static void sort(int[] array){
        int n = array.length;

        for (int i = n/2-1; i >=0 ; i--) {
            heap(array,n,i);
        }
        for (int i = n-1; i >=0 ; i--) {
            int buff = array[0];
            array[0] = array[i];
            array[i] = buff;
            heap(array,i,0);
        }

    }

    private static void heap(int[] array,int n , int p)
    {
        int larg = p;
        int left = 2*p+1;
        int right = 2*p +2;

        if (left<n && array[left] > array[larg]) {
            larg = left;
        }
        if (right < n && array[right] > array[larg]) {
            larg = right;
        }


        if (larg != p) {
            int buf = array[p];
            array[p] = array[larg];
            array[larg] = buf;
            heap(array,n,larg);
        }
    }

}
