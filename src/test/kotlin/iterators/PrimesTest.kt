package iterators

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class MyTests : StringSpec({
    "length should return size of string" {
        val primes = Primes().iterator()
        for(expectedPrime in listOf(2, 3, 5, 7, 11, 13, 17, 19)) {
            primes.next() shouldBe expectedPrime
        }
    }
})
