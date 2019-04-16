package iterators

open class Fibonacci(private val limit: Int) : Iterator<Int> {
    var first = 0
    var second = 1
    var nextTerm = 1

    override fun hasNext(): Boolean {
        return nextTerm < limit
    }

    override fun next(): Int {
        first = second
        second = nextTerm
        nextTerm = first + second
        return second
    }
}
