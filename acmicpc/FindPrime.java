/**
 * determine given integer is the prime number or not in O(root(N)) time

public class FindPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(5));

    }
    public static boolean isPrime(int n) {
        if ( n < 2 ){
            return false;
        }
        for (int i=2; i*i < n ; i++){
            if ((n%i) == 0) {
                return false;
            }
        }
        return true;
    }
}
