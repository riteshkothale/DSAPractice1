public class SumOfOddNumbers {

    public static void main(String args[]){

        int n = 2;
        int oddSum = 0;

        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                oddSum = oddSum + i;
            }
        }

        System.out.println("Sum of Odd numbers : " +  oddSum);
    }
}
