public class SumofNumberDivisibleBy3 {

    public static void main(String args[]){

        int n =3;
        int sum = 0;

        for (int i=1; i<=n;i++){
            if(i%3==0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum :"+ sum);
    }
}
