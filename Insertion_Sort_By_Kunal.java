public class Insertion_Sort_By_Kunal {
    public static void insertionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i <= n - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 4, 1, 2 };
        insertionSort(arr);

        // printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
