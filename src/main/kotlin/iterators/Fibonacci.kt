package iterators

open class Fibonacci(private val limit: Int) : Iterator<Int> {
    var first = 0
    var second = 1
    var nextTerm = 1

    var called = 0

    override fun hasNext(): Boolean {
        return nextTerm < limit
    }

    override fun next(): Int {
        if(++called == 1) {
            return first
        }
        if(called == 2) {
            return second
        }

        first = second
        second = nextTerm
        nextTerm = first + second
        return second
    }
}
