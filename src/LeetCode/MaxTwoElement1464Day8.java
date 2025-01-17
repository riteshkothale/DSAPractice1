package LeetCode;

/*
Input: nums = [3,4,5,2]
Output: 12
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
Example 2:

Input: nums = [1,5,4,5]
Output: 16
Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
Example 3:
 */
public class MaxTwoElement1464Day8 {

    public static void main(String[] args) {
        int a[] = {3,2,4};
        System.out.println(maxProduct(a));
    }

    public static int maxProduct(int[] nums) {

        int max = -1;
        int smax = -1;

        for (int i=0; i<nums.length; i++){
            if (max < nums[i]){
                smax = max;
                max = nums[i];
            }else if (smax<nums[i]){
                smax = nums[i];
            }
        }

        int sum = (max -1) * (smax -1);
        return sum;
    }
}
