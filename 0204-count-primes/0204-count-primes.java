class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);

        primes[0] = false;
        primes[1] = false;

        for(int i = 2; i<= Math.sqrt(n); i++) {
            if(primes[i]) {
                for(int j=i*i; j<n; j+=i) {
                    primes[j] = false;
                }
            }
        }


        int count = 0;
        for(boolean prime : primes) {
            if(prime) {
                count++;
            }
        }

       return count;
    }

    //  public int countPrimes(int n) {
    //     int count = 0;
    //     for (int i = 2; i < n; i++) {
    //         if (!isPrime(i)) {
    //             count++;
    //         }
    //     }  

    //     return count;
    // }

    //  public static boolean isPrime(int n) {
    //     if (n < 2) return false;
    //     for (int i = 2; i <= Math.sqrt(n); i++) {
    //         if (n % i == 0)
    //             return false;
    //     }
    //     return true;
    // }
}