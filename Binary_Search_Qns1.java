//order diagonastic binar search
public class Binary_Search_Qns1 {
    public static int orderAgnosticBs ( int numbers[], int key){
        int start = 0, end = numbers.length-1;

        //find wheather a array is sorted in ascending or descending
        boolean isAscending;
        if(numbers[start] < numbers[end]){
            isAscending = true;
        } else {
            isAscending = false;
        }

        while(start <= end){
            int mid=(start + end)/2; //found

            //comparison
            if(numbers[mid] == key){
                return mid;
            }

            if(isAscending){
            if(numbers[mid] < key){ //right
                start=mid+1;
            } else { //left
                end=mid-1;
            }
        } else {
                if(numbers[mid] > key){ //right
                    start=mid+1;
                } else { //left
                    end=mid-1;
                }
            }
    }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {9,8,7,6,5,4,3,2,1};
        int key = 9;

        System.out.println(orderAgnosticBs(numbers, key));
        
    }
}
