public class FactorialNumber {

    public static void main(String[] args) {

        int n = 5;
        int factorial = 1;

        for(int i=2 ; i<=n; i++){
            factorial = factorial * i;
        }

        System.out.println("Factorial :" + factorial);
    }
}
