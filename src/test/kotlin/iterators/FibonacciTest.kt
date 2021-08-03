package iterators

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class FibonacciTest : StringSpec({
    "Fibonacci should return correct sequence" {
        val fibonacci = Fibonacci(11).iterator()
        for(expectedFibonacciSequence in listOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55)) {
            fibonacci.next() shouldBe expectedFibonacciSequence
        }
    }
})