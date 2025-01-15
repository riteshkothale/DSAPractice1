package LeetCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
Example 1:

Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
Example 2:

Input: num = [2,7,4], k = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455
 */
public class ArrayFormInteger989Day7 {

    public static void main(String[] args) {
        int a[] = {1,2,0,0};
        System.out.println(addToArrayForm(a,34));
    }

    static public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        int p = num.length - 1;
        int carry = 0;
        while (p >= 0 || k > 0) {

            int numval = 0;
            if (p >= 0) {
                numval = num[p];
            }
            int d = k % 10;
            int sum = numval + d + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ans.add(digit);
            p--;
            k = k / 10;

        }

        if (carry > 0) {
            ans.add(carry);
        }

        Collections.reverse(ans);
        return ans;
    }

    }
