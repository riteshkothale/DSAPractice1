package pattern;

public class TrianglePattern {

    public static void main(String[] args) {


        System.out.println("-----------------------------");
        int n = 4;

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
    }
}
