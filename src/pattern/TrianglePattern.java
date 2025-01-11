package pattern;

public class TrianglePattern {

    public static void main(String[] args) {


        System.out.println("-----------------------------");
        int n = 5;

        for(int i=0; i<n; i++){
            for(int j=0;j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");

        for (int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(i+1 +" ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------");
        char ch = 'A';
        for (int i=0; i<n; i++){
            for (int j=0; j<i+1; j++){
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }

        System.out.println("-----------------------------------------");

        for (int i=0; i<n; i++){
            for (int j=1;j<=i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------");

        for(int i=1; i<=n; i++){
            for (int j=i; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------------------");
        for (int i=0; i<n; i++){
            ch = 'A';
            for (int j=i+1; j>0; j--){
                int temp = ch + j -1;
                System.out.print((char) temp);
            }
            ch++;
            System.out.println();
        }
    }
}
