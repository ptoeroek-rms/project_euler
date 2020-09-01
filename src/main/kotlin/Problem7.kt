import iterators.Primes

fun main() {
    println("6th prime is: ${getNthPrime(5)}")
    println("10 001st prime is: ${getNthPrime(10_000)}")
}

fun getNthPrime(index: Int): Int {
    val primes = Primes(2)
    repeat(index) { primes.next() }
    return primes.next()
}
