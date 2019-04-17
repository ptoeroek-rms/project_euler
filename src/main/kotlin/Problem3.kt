import iterators.Primes

fun main() {
    println("Prime factors for 13195: ${getPrimeFactors(13195)}")
    println("Largest prime factor for 600851475143: ${getPrimeFactors(600851475143).last()}")
}

fun getPrimeFactors(number: Long): List<Int> {
    val primes = Primes().iterator()
    var remainder = number
    val result = mutableListOf<Int>()
    while (remainder != 1L) {
        val nextPrime = primes.next()
        while(remainder % nextPrime == 0L) {
            remainder /= nextPrime
            result.add(nextPrime)
        }
    }
    return result
}
