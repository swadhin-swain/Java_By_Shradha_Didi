//search in rotated sorted array  
public class Binary_Search_Qns8 {
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
            return orderAgnosticBs(numbers, target, pivot+1, numbers.length-1);
        }
        
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
     int numbers[] = {4,5,6,7,0,1,2};
     int target=0;   

     System.out.println(element(numbers, target));
    }
}
