class Prime{
    public static boolean isPrime(int n){
        int divisor = 2;
        while (divisor < n){
            if ((n % divisor) == 0){
                return false;
            } else {
                divisor++;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int i=2;
        while (i <= 100){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
            i++;
        }
        
    }
}
