    package practice;

    public class Practice1 {

        public static void main(String[] args) {

            int n=4;

           //outer
           for (int i=0; i<n; i++) {

               //space1
               for (int j = 1; j <= n - i - 1; j++) {
                   System.out.print("-");
               }
               System.out.print("*");

               //space2
               if (i != 0) {
                   for (int j = 1; j <= 2 * i - 1; j++) {
                       System.out.print("-");
                   }
                   System.out.print("*");
               }
               System.out.println();
           }
               for (int  i=0; i<n-1; i++){

                   for (int j=1; j<=i+1; j++){
                       System.out.print("-");
                   }
                   System.out.print("*");

                   if (i!=n-2) {
                       for (int j = 1; j <= (2 * (n - i) - 5); j++) {
                           System.out.print("-");
                       }
                       System.out.print("*");
                   }
                   System.out.println();
               }


        }
    }
