/*find the missing number in an array nums[] containing in distinct numbers in the range[0,n].
Return the only numbers that is missing from the array 
ex- nums=[3,0,1]
output-ans = 2 */

public class Cyclic_Sort_Qns1 {
    public static int missingNums(int nums[]){
         int i = 0;
         
        while(i < nums.length){
            int correctIndex = nums[i];

            if(nums[i] < nums.length && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
        //case-1
        for(int index = 0;index<nums.length;index++){
            if(nums[index] != index){
                return index;
            }
        }
        //case-2
        return nums.length;
    }
    public static void main(String[] args) {
        int nums[]= {3,0,1};

        System.out.println("Missing number is "+missingNums(nums));
    }
}
