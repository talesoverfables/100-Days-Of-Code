## Sieve of Eratosthenes (Prime Number Algorithm)

The **Sieve of Eratosthenes** is a classic and efficient algorithm to find all **prime numbers up to a given number `n`**.

### Idea:
Mark the multiples of each prime number starting from `2` as **non-prime**. The remaining unmarked numbers are primes.

---

### Steps:
1. Create a boolean array `isPrime[]` of size `n+1` and initialize all entries as `true`.
2. Set `isPrime[0] = false` and `isPrime[1] = false`, since 0 and 1 are not prime.
3. For each number `i` from `2` to `√n`:
   - If `isPrime[i] == true`:
     - Mark all multiples of `i` (from `i*i` to `n`) as `false`.
4. After the loop, all `isPrime[i] == true` are prime numbers.

---

### Time Complexity:
- **O(n log log n)** – Very fast even for large `n`.

### Space Complexity:
- **O(n)** for the boolean array.
