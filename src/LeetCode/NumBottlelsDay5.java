package LeetCode;

public class NumBottlelsDay5 {

    public static void main(String[] args) {

        System.out.println("Bottel :"+ numWaterBottles(9,3));

    }

    public static int numWaterBottles(int numBottles, int numExchange) {

        int ans = numBottles;

        while (numBottles >= numExchange){

            int changed = numBottles / numExchange ;
            int reaminng = numBottles % numExchange;

            ans = ans + changed;
            numBottles = reaminng + changed;
        }
        return ans;

    }
}


