package iterators

open class Primes : Iterable<Int> {
    override fun iterator(): Iterator<Int> {
        val primes = mutableListOf(2, 3)
        val firstPrimes = mutableListOf(2, 3)

        fun isPrime(number: Int): Boolean {
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

        fun nextPrime(number: Int): Int {
            var i = number
            do {
                i += 2
            } while(!isPrime(i))

            return i
        }

        return object : Iterator<Int> {
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
    }
}
