public class Cyclic_Sort_Qns6 {
    public static int firstMissingPositive(int arr[]){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] > 0 && arr[i] < arr.length && arr[i]!= arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        for(int index = 0;index<arr.length;index++){
        if(arr[index] != index+1){
            return index + 1;
        }
        }
        //case 2 if array is sorted from 1 to n-1;ex-[1,2,3,4]
        return arr.length+1;
    }
    public static void main(String[] args) {
        int arr[] = {-1,1,3,4};
        System.out.println(firstMissingPositive(arr));
    }
}
