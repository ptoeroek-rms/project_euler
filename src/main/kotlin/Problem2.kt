import iterators.Fibonacci

fun main() {
    print("Given example: ")
    val fibonacciExample = Fibonacci(4_000_000)
    for(i in 1..10) {
        print("${fibonacciExample.next()}, ")
    }

    var result = 0
    for(i in Fibonacci(4_000_000)) {
        if(i % 2 == 0) {
            result += i
        }
    }
    println("Solution: $result")
}
