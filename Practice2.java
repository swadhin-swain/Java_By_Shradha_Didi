/*
 Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */
import java.util.Arrays;
public class Practice2 {
  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    //taking the copies of array in given range
      int first []=Arrays.copyOfRange(nums1, 0, m);
      int second[]=Arrays.copyOfRange(nums2, 0, n);
      int mix[] = new int[first.length+second.length];

      //taking two array in a single array
      for(int i=0;i<first.length;i++){
        mix[i]=first[i];
      } 

      for(int i=0;i<second.length;i++){
        mix[first.length+i]=second[i];
      } 
      //calling the devide function
    devide(mix, 0, mix.length-1);

    //printing the final result
    for(int i=0;i<mix.length;i++){
      System.out.print(mix[i]+" ");
    }
    
    }
    public static void devide(int mix[],int startIndex,int endIndex){
      if(startIndex>=endIndex){
        return;
      }

      int mid = startIndex+(endIndex-startIndex)/2;
      devide(mix, startIndex, mid);
      devide(mix, mid+1, endIndex);
      conquer(mix,startIndex,mid,endIndex);
    }

    public static void conquer(int[] mix, int startIndex, int mid, int endIndex) {
      int newArray[] = new int[endIndex-startIndex+1];

      int index1=startIndex;
      int index2=mid+1;
      int indexX=0;

      while(index1 <= mid && index2 <= endIndex){
        if(mix[index1] <= mix[index2]){
          newArray[indexX++] = mix[index1++];
        } else {
          newArray[indexX++] = mix[index2++];
        }
      }

      
      while (index1 <= mid) {
        newArray[indexX++] = mix[index1++];
      }

      while (index2 <= endIndex) {
        newArray[indexX++] = mix[index2++];
      }
      for(int i=0,j=startIndex;i<newArray.length;i++,j++){
        mix[j] = newArray[i];
      }

    }

  public static void main(String[] args) {
    int nums1[] = {1,2,3,0,0,0};
    int nums2[] = {2,5,6};
    int m=3,n=3;
    merge(nums1,m,nums2,n);
  }
} 
  

