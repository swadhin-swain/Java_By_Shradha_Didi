//swap 2 number in an array
public class Array_Qns17 {
    public static void swap(int arr[],int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        swap(arr, 1, 3);
    
        for(int i=0;i<arr.length;i++){
            System.out.printf("%d\t",arr[i]);
        }
    }
}
