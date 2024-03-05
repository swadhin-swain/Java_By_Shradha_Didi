//find the ceiling of a number

public class Binary_Search_Qns2 {

    public static int ceilingOfNumber(int numbers[], int target){
        //what if the target number is greater then the greatest number in the array
        // if(target > numbers[numbers.length-1]){
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
        return start;
    } else {
        return end;
    }
    }
    
    public static void main(String[] args) {
        int numbers[] = {2,3,5,9,14,16,18};
        int target = 17;

        int n = ceilingOfNumber(numbers, target);

        if(n >=0){
            System.out.println("The ceiling of "+target+" is "+numbers[n]);
        } else {
            System.out.println(n);
        }
    }
}
