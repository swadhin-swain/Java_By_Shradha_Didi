//find the position of the element in the infinite array
public class Binary_Search_Qns5 {  
    public static int findPositionInInfiniteLoop(int numbers[], int target,int start,int end){
        
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < numbers[mid]){
                end = mid - 1;
            } else if (target > numbers[mid]){
                start = mid + 1;
            } else {
                return mid ;
            }
        }

        return -1;
    }
    public static int ans(int numbers[], int target){
        //first find the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while (target > numbers[end]){
            int temp = end + 1; //this iws my new start
            //double the box value
            //end = previous end + sizeOfBox * 2;
            end = end + (end - start +1)*2; //this is my new end
            start = temp; 
        }

        return findPositionInInfiniteLoop(numbers, target, start, end);
    }
    public static void main(String[] args) {
        //start with the box of size 2
        int numbers[] = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;

        System.out.println("The index of the target is "+ans(numbers, target));
    }
}
