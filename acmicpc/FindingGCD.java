public static int findingGCD(int a, int b){
        if (b==0) {
            return a;
        }
        else {
            return findingGCD(b, a%b);
        }
}
