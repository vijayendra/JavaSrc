class PrimeNumbers{
    public static void findPrimes(int n){
        // Finding prime numbers using Array
        boolean[] primes = new boolean[n+1];
        int i;
        int devisor;
        for(i=2; i <= n; i++){
            primes[i] = true;
        }
        for(devisor=2; (devisor*devisor <= n); devisor++){
            if (primes[devisor]){
                for(i=2*devisor; i <= n; i = i+devisor){
                    primes[i] = false;
                }
            }
        }
        System.out.println("Prime numbers are: ");
        
        for(i=2; i <= n; i++){
            if(primes[i]){
                System.out.print(" "+i);
            }
        }
        System.out.println("");
    }
    
    public static void main(String[] args){
        int n = 1000;
        findPrimes(n);
    }
}
