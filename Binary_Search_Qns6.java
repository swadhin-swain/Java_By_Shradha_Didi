//found the peak of the mountain array

public class Binary_Search_Qns6 {
    public static int peakOfTheMountain(int numbers[]){
        int start = 0;
        int end = numbers.length-1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(numbers[mid] > numbers[mid+1]){
                //you are in desc part of the array
                //this may be ans but look at left
                //this is why mid != mid - 1
                end = mid;
            } else {
                //you are in asc part of the array
                start = mid + 1;
            }
        }
        //in the end start == end and pointing o the largest number because of the 2 checks ofd the above
        //start and  end are always trying to find the max element in the above 2 checks
        //hence, when they are pointing to 1 element that is the answer because that is what the checks says
        return start;//or you can  must retuirn end also
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,4,3,2,1};

        System.out.println("The peak of the mountain array is "+numbers[peakOfTheMountain(numbers)]);
    }
}
