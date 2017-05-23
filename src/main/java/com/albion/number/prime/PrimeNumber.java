package com.albion.number.prime;

import java.util.Arrays;

public class PrimeNumber {

    public static int MAX_CHECKED_PRIME = 10000;
    boolean[] primes = new boolean[MAX_CHECKED_PRIME];

    public PrimeNumber() {
        fillSieve();
    }
    //set up the prime sieve
    public void fillSieve() {
        Arrays.fill(primes,true);
        // assume all integers are prime.
        primes[0]=false;
        primes[1]=false;
        // we know 0 and 1 are not prime.
        for (int i=2;i<primes.length;i++) {
            //if the number is prime,
            //then go through all its multiples and make their values false.
            if(primes[i]) {
                for (int j=2;i*j<primes.length;j++) {
                    primes[i*j]=false;
                }
            }
        }
    }

    /**
     * Since this can be tested
     * @param n
     * @return
     */
    public boolean isPrime(int n) {
        if(n < MAX_CHECKED_PRIME){
            return primes[n];
        } else {
            throw new RuntimeException("Cannot compute this prime number since it's bigger than prime sieve");
        }
    }

    boolean isPrimeV2(int n) {
        //check if n is a multiple of 2
        if (n%2 == 0) {
            return false;
        }
        //if not, then just check the odds
        for(int i = 3;i*i <= n;i += 2) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
