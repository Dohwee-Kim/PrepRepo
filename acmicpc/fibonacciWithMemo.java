public class FibonacciWithMemo {

    public static void main(String[] args) {
        int n1 = 5;

        long startTime1 = System.nanoTime();
        fibonacciClassical(n1);
        long duration1 = System.nanoTime() - startTime1;

        long startTime2 = System.nanoTime();
        fibonacciWithMemo(n1);
        long duration2 = System.nanoTime() - startTime2;

        System.out.println(duration1);
        System.out.println(duration2);
    }


    public static int fibonacciWithMemo(int n) {
        int[] memo = new int[100];
        if ( n<=1) {
            return n;
        }
        else {
            memo[n] = fibonacciWithMemo(n-1) + fibonacciWithMemo(n-2);
            return memo[n];
        }


    }

    public static int fibonacciClassical(int n){
        if ( n <= 1 ){
            return n;
        }
        else {
            return fibonacciClassical(n-1) + fibonacciClassical(n-2);
        }
    }

}

