/* given an array nums of n integer where nums[i] is in the range [1,n].
Return an array of all the integer in the range [1,n] that do not appear in nums.
 ex- nums[]={4,3,2,7,8,2,3,1};
 output-[5,6]
 */
import java.util.ArrayList;

public class Cyclic_Sort_Qns2 {
    public static ArrayList<Integer> disappearedNumbers(int nums[]){
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
        //find missing number
        ArrayList<Integer> ans = new ArrayList<>(); 
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=(index+1)){
               ans.add(index + 1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};

        System.out.println(disappearedNumbers(nums));
    }
}
