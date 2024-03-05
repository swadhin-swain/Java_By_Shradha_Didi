//find the rotation number of the rotated array

public class Binary_Search_Qns10 {
    //function for finding the pivot
    public static int countRotation(int numbers[]){
        return pivot(numbers)+1;
    }
    //function for finding the pivot
    public static int pivot(int numbers[]){
        int start =0;
        int end= numbers.length-1;

        while(start <= end){
            int mid = start+(end-start)/2;

            if(mid < end && numbers[mid]>numbers[mid+1]){
                return mid;
            }

            if(mid > start && numbers[mid]<numbers[mid-1]){
                return mid-1;
            }

            if(numbers[start] >= numbers[mid]){
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        int numbers[] = {4,5,6,7,0,1,2};
        System.out.println("The number of rotation is "+countRotation(numbers));
    }
}
