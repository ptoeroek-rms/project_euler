package iterators

open class Primes : Iterator<Int> {
    private val primes = mutableListOf(2, 3)
    private val firstPrimes = mutableListOf(2, 3)

    private fun isPrime(number: Int): Boolean {
        for(divisor in primes) {
            if(divisor * divisor > number) {
                primes.add(number)
                return true
            } else if(number % divisor == 0) {
                return false
            }
        }
        return true
    }

    private fun nextPrime(number: Int): Int {
        var i = number
        do {
            i += 2
        } while(!isPrime(i))

        return i
    }

    override fun hasNext(): Boolean {
        return true
    }

    override fun next(): Int {
        if(firstPrimes.isNotEmpty()) {
            return firstPrimes.removeAt(0)
        }
        return nextPrime(primes.last())
    }
}
