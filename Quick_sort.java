public class Quick_sort {
    // recursive function for quick sort

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            // finding the pivoy point
            int pivotIndex = partition(arr, low, high);

            // call the quick sort for sorting the element that occurs before the pivot
            quickSort(arr, low, pivotIndex - 1);

            // call the quick sort for sorting the element that occurs after the pivot
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // let's create the partition function which can return the index
    public static int partition(int arr[], int low, int high) {
        // let assume the pivot is the last element of the array
        int pivot = arr[high];
        int i = low - 1;// which can track the number of smaller element before the pivot

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // create a space for pivot
        i++;
        // then swap the pivot
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        // return the pivot index
        return i;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
