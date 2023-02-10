package Arrays;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        //int size = 6;
        int[] arr = {90, 45, 80, 99, 56, 2};
        int size = arr.length;
        bubbleSort(size, arr);
    }

    public static void bubbleSort(int size, int[] arr) {
        int[] res = new int[size];
        for (int i=0; i<size-1; i++) {
            for (int j=0; j<size-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    swap(j, j+1, arr);
                }
            }
        }
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
