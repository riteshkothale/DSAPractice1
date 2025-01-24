package LeetCode;
/*
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

 */
public class MedianDay9 {

    public static void main(String[] args) {

    }

    static double median(int[] num1, int[] num2){
        int[] ans = merge(num1, num2);

        if(ans.length%2 != 0){

            double ans1 =(double)  ans[ans.length]/2;
            return ans1;
        } else {
            double ans1 = (double) (ans[ans.length/2] + ans[ans.length/2-1])/2;
            return ans1;
         }

    }

    public static int[] merge(int[] arr1, int[] arr2){

        int[] ans = new int[arr1.length + arr2.length];

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while (p1<arr1.length || p2<arr2.length){

            int val1 = p1<arr1.length ? arr1[p1] : Integer.MAX_VALUE;
            int val2 = p2<arr2.length ? arr2[p2] : Integer.MAX_VALUE;

            if(val1<val2){
                ans[p3] = val1;
                p1++;
            } else {
                ans[p3] = val2;
                p2++;
            }
            p3++
        }
        return ans;
    }
}
