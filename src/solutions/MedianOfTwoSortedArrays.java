package solutions;

public class MedianOfTwoSortedArrays {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalSize = nums1.length + nums2.length;
        int median = totalSize / 2;
        double result = 0;
        if(totalSize%2 != 0)
            median++;
        
        int nums1pointer = 0;
        int nums2pointer = 0;
        int currentNum = 0;
        while(true){
            if(nums1pointer < nums1.length && nums2pointer < nums2.length){
                if(nums1[nums1pointer] > nums2[nums2pointer]){
                    currentNum = nums2[nums2pointer];
                    nums2pointer++;
                }
                else{
                    currentNum = nums1[nums1pointer];
                    nums1pointer++;
                }
            } else {
                if(nums1pointer < nums1.length){
                    currentNum = nums1[nums1pointer];
                    nums1pointer++;
                } else {
                    currentNum = nums2[nums2pointer];
                    nums2pointer++;
                }
            }
            if(nums1pointer+nums2pointer == median){
                result += currentNum;
                if(totalSize%2 != 0){
                    break;                    
                }
            }
            if(nums1pointer+nums2pointer == median + 1){
                result += currentNum;
                result = result/2;
                break;
            }
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(findMedianSortedArrays(new int[] {1,2}, new int[] {3,4}));
	}
}
