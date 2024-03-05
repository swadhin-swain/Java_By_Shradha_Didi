//find the floor of a number in a sorted array

public class Binary_Search_Qns3 {

    public static int floorOfNumber(int numbers[], int target){
       //if the target is less than the smallest number in the array
        // if(target < numbers[0]){
        //     return -1;
        // }

        int start = 0, end = numbers.length-1;

        //find wheather a array is sorted in ascending or descending
        boolean isAscending;
        if(numbers[start] < numbers[end]){
            isAscending = true;
        } else {
            isAscending = false;
        }
        //what if the target number is less than the smallest number in the array
        if(target < numbers[0]){
            return -1;
        }
        while(start <= end){
            int mid=(start + end)/2; //found

            //comparison
            if(numbers[mid] == target){
                return mid;
            }

            if(isAscending){
            if(numbers[mid] < target){ //right
                start=mid+1;
            } else { //left
                end=mid-1;
            }
        } else {
                if(numbers[mid] > target){ //right
                    start=mid+1;
                } else { //left
                    end=mid-1;
                }
            }
    }
        if(isAscending){
            return end;
        } else {
            return start;
        }
    }
    
    public static void main(String[] args) {
        int numbers[] = {2,3,5,9,1};
        int target = 13;

        int n = floorOfNumber(numbers, target);

        if(n >=0){
            System.out.println("The ceiling of "+target+" is "+numbers[n]);
        } else {
            System.out.println(n);
        }
    }
}
