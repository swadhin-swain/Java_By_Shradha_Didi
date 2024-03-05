//find the element in the mountain array
public class Binary_Search_Qns7 {
    public static int SearchElementInMountainArray(int numbers[], int target){
        int peak = peakOfTheMountainArray(numbers);
        int firstTry = orderAgnosticBs(numbers, target, 0, peak);

        if(firstTry != -1){
            return firstTry;//this is our answer
        }
        //then try to search in second half
       return orderAgnosticBs(numbers, target, peak+1, numbers.length-1);
    }


    public static int orderAgnosticBs ( int numbers[], int key,int start,int end){
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


    public static int peakOfTheMountainArray(int numbers[]){
        int start=0;
        int end =numbers.length-1;

        while(start < end){
            int mid = start + (end-start)/2;

            if(numbers[mid] > numbers[mid+1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    
    public static void main(String[] args) {
       int numbers[] =  {1,2,3,4,5,3,1};
       int target = 5;
       System.out.println(SearchElementInMountainArray(numbers, target));
    }
}
