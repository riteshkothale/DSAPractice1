public class ForLoop {

    public static void main(String args[]){
        // Sum of 1 to N number
        int n = 5;
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum += i;
            System.out.println( "i :" + i + "  n ="  +n + " sum :" +sum);
        }
        System.out.println(sum);
    }
}
