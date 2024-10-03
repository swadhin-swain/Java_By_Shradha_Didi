//find the median of the  2 sorted array

public class Leetcode_Qns3 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //find the length of the 2 sorted array
        int length1 = nums1.length;
        int length2 = nums2.length;

        //craete a new array in which we can store these 2 arrays by merging
        int newArray[] = new int[length1 + length2];

        int i = 0;
        int j = 0;
        int k = 0;

        //now we can merge these two arrays
        while(i < length1 && j < length2) {
            if(nums1[i] <= nums2[j]) {
                newArray[k++] = nums1[i++];
            } else {
                newArray[k++] = nums2[j++];
            }
        }

        while (i < length1) {
            newArray[k++] = nums1[i++];
        }

        while (j < length2) {
            newArray[k++] = nums2[j++];
        }

        //now we can find the median of the element in newArray
        int mid = newArray.length/2;
        double result = 0;

        if(newArray.length % 2 ==0) {
            result = (double)(newArray[mid] + newArray[mid - 1])/2;
        } else {
            result = newArray[mid];
        }

        return result;
    }
    public static void main(String[] args) {
        int num1[] = {1,2};
        int num2[] = {3,4};

        System.out.println(findMedianSortedArrays(num1, num2));
    }
}
