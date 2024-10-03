//example if bubble sort by shradha didi

public class Bubble_Sort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;// length of the array

        // bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };

        // call the bubble sort function
        bubbleSort(arr);
        // print the element of the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
