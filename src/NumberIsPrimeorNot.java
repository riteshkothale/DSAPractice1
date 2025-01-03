public class NumberIsPrimeorNot {

    public static void main(String args[]){

        int n =3;
        boolean isPrime = true;

        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            System.out.println("Number is prime :"+n);
        } else {
            System.out.println("Number is not prime number : "+n);
        }
    }
}
