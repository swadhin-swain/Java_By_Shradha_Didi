//rotated binary search in an array with duplicates
public class Binary_Search_Qns9 {
     //function to call the both function for finding the element
     public static int element(int numbers[],int target){
        int pivot = pivot(numbers);

        //if you do not find the pivot then the aarray is not rotated
        if(pivot == -1){
            return orderAgnosticBs(numbers, target, 0, numbers.length-1);
        }
        //if the pivort is found then you search in two asc order
        if(numbers[pivot]== target){
            return pivot;
        }

        if(target > numbers[0]){
            return orderAgnosticBs(numbers, target, 0, pivot-1);
        }else{
            
        }
        return orderAgnosticBs(numbers, target, pivot+1, numbers.length-1);
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
            //if the elements at the start , middle, and end are same then just skip the duplicates
            if(numbers[mid] == numbers[start] && numbers[mid] == numbers[end]){
                //skip the duplicates
                //NOTE: what if these elements in start and end are the pivot
                //check the start is pivot
                if(numbers[start] > numbers[start+1]){
                    return start;
                }
                start++;

                //check wheather end is pivot
                if(numbers[end] < numbers[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted , so pivot is in right side
            else if (numbers[start]<numbers[mid] || (numbers[start] == numbers[mid] && numbers[mid] > numbers[end])) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return  -1;
    }

     //function for finding the element
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
    public static void main(String[] args) {
        int numbers[] = {2,9,2,2,2};
        int target = 2;
        System.out.println(element(numbers, target));
    }
}
