import java.util.ArrayList;

/**
 * @author bobbyw
 *
 * This validator will take an input num = maximum number of prime of either x or y.
 * It will also generate the arraylist named primes that has all prime numbers from 2 to num in its constructor.
 * This validator has a method named isAdditve that takes the secret method as input,
 * and will return true as if the method works for secret(x+y)=secret(x)+secret(y),
 * or return false if it doesn't.
 */

public class Validator {
    int num;
    ArrayList<Integer> primes;

    public Validator(int num) {
        this.num = num;
        this.primes = generatePrimeNumbers();
    }

    public  boolean isAdditive(Secret aSecret) {
        for (int i = primes.get(0); i < primes.size(); i++) {
            for (int j = i; j < primes.size(); j++) {
                int x = primes.get(i);
                int y = primes.get(j);
                if (aSecret.secret(x + y) != aSecret.secret(x) + aSecret.secret(y)) {
                    return false;
                }
            }
        }
        return true;
    }

    // This will generate all prime numbers within N, time Complexity: O(nloglogn)
    private ArrayList<Integer> generatePrimeNumbers() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean[] isPrime = new boolean[num + 1];
        for (int i = 2; i <= num; i++) {
            isPrime[i] = true;
        }
        // This is the Sieve of Eratosthenes!
        for (int i = 2; i * i <= num; i++) {
            // all of multiple of i would be non-prime, if i is prime
            if (isPrime[i]) {
                for (int j = i; i * j <= num; j++) {
                    isPrime[i * j] = false;
                }
            }
        }
        for (int i = 2; i <= num; i++) {
            if (isPrime[i]) {
                list.add(i);
            }
        }
        return list;
    }
}
