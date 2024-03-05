//find the duplicate number from the array
//ex- arr=[1,1]->answer is 1
//ex- arr=[3,1,3,4,2]->answer is 3
public class Cyclic_Sort_Qns3 {
    public static int disappearedNumbers(int nums[]){
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            
            if(nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            } else {
                i++;
            }
        }
       
        //find the duplicate number 
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=(index+1)){
               return nums[index];
            }
        }
    
        return -1;

         //or
    //      while(i<nums.length){
    //         if(nums[i]!=i+1){
    //             int correct=nums[i]-1;
    //             if(nums[i]!=nums[correct]){
    //                 int temp = nums[i];
    //                 nums[i]=nums[correct];
    //                 nums[correct]=temp;
    //         } else {
    //             return nums[i];
    //         }
    //     } else {
    //         i++;
    //     }
    // }
    // return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,1};

        System.out.println(disappearedNumbers(nums));
    }
}