package LeetCode;

public class PowerOfTwo {

    public static void main(String[] args) {
        int input = 16;
        System.out.println("Output :" + powerOfTwo(input));
    }

    public static boolean powerOfTwo(int n){

        if(n<1){
            return true;
        }
        while (n%2 == 0){
            n=n/2;
        }

        if (n==1){
            return true;
        } else {
            return false;
        }
    }
}
