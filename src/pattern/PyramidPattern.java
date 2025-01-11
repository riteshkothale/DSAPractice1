package pattern;

public class PyramidPattern {

    public static void main(String[] args) {

        int n=10;

        for (int i=0; i<n; i++){

            //space - n-i-1
            for (int j=1; j<=n-i-1; j++){
                System.out.print(" ");
            }

            //num1 - 1 to i+1
            for (int j=1; j<=i+1; j++){
                System.out.print(j);
            }

            //num3 - j = i to 1
            for (int j=i; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
