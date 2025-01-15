package LeetCode;

public class TwoSumDay6 {

    /*

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    Example 2:

    Input: nums = [3,2,4], target = 6
    Output: [1,2]
     */

    public static void main(String[] args) {
        int a[] = {3,2,4};
        System.out.println(twoSum(a, 6));
    }

    public static int[] twoSum(int[] nums, int target) {

        int arr[] = new int[2];

        for (int i=0; i< nums.length; i++){
            for (int j=i+1; j<nums.length;j++){
                int sum = nums[i] + nums[j];
                if (sum == target){
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }
}
